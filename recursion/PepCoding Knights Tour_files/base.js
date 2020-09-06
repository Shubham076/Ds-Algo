var startPerPage = 10;
var courseId = PEP.Resources.CourseId();
var lectureId = PEP.Resources.LectureId();

$statsContainer = $('#statsContainer');
$btnOpenSideNav = $('#openSideNav');
$btnCloseSideNav = $('#closeSideNav');

function showStats(pageFrom) {
    if (!courseId) {
        return;
    }

    var action;
    var pageSize = startPerPage;

    if (pageFrom == 0) {
        return;
    }
    if (!pageFrom)
        pageFrom = 1;

    // action = '/stats/courseId/' + courseId + '/pageSize/' + pageSize + '/pageFrom/' + pageFrom;

    if (courseId && lectureId) {
        action = '/stats/courseId/' + courseId + '/lectureId/' + lectureId + '/pageSize/' + pageSize + '/pageFrom/' + pageFrom;
    } else if (courseId) {
        action = '/stats/courseId/' + courseId + '/pageSize/' + pageSize + '/pageFrom/' + pageFrom;
    }

    if (!(pageFrom == 1 && pageSize == 10))
        window.PEP.showLoader();
    $.ajax({
        url: action,
        dataType: 'json',
        method: 'Get',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            $statsContainer.html(response.data);
            $("#stat" + response.userId).addClass("grey white-text");

            $('.pageLi').on('click', function () {
                showStats($(this).attr('index'));
            });

            $('#showStatsPerpage').on('change', function () {
                startPerPage = this.value;
                showStats(1);
            });

            window.PEP.hideLoader()
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function openResourceNav() {
    PEP.createCookie('isSideNavOpen', true);
    $('#side-open-nav')[0].style.width = "270px";
    $('.resource-container').css('margin-left', '270px');
    $('.openSideNav').addClass('hide');
    $('.closeSideNav').removeClass('hide');
    $('.search-container').removeClass('hide').hide(0).delay(70).show(0);
    if ($('.full-screen')[0]) {
        $('.full-screen')[0].style.marginLeft = "42vw";
    }
    if ($('.whole')[0]) {
        $('.whole').toggleClass('sideNavOpen');
    }
    if ($("input[name='isSideNavOpen']")[0]) {
        $("input[name='isSideNavOpen']").val(true);
    }

}

function closeResourceNav() {
    PEP.createCookie('isSideNavOpen', false);
    $('.search-container').addClass('hide').show(0).delay(70).hide(0).fadeOut();
    $('#side-open-nav')[0].style.width = "0px";
    $('.resource-container').css('margin-left', '0px');
    $('.closeSideNav').addClass('hide');
    $('.openSideNav').removeClass('hide');
    if ($('.full-screen')[0]) {
        $('.full-screen')[0].style.marginLeft = "52vw";
    }
    if ($('.whole')[0]) {
        $('.whole').toggleClass('sideNavOpen');
    }
    if ($("input[name='isSideNavOpen']")[0]) {
        $("input[name='isSideNavOpen']").val(false);
    }
}


function getAllModules() {
    var moduleName = $(".classResourceList.active div")[0] ? $(".classResourceList.active div")[0].innerText : "";
    moduleName = moduleName.trim();
    var lectureId = $(this).attr('lect-id');
    lectureId = lectureId ? lectureId : '';

    $.ajax({
        url: '/modules',
        dataType: 'json',
        method: 'GET',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response && response.data) {

                $('#moduleList' + lectureId).empty().append(response.data);
                $("#moduleList option").filter(function () {
                    return this.text == moduleName;
                }).attr('selected', true);

            }
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}



function addLecture() {
    $name = $('#lectureName');
    $description = $('#lectureDescription');
    var moduleId = $('#moduleList option:selected').val();
    var code = $name.val() ? convertNameToCode($name.val()) : '';
    var indexes = $('#lectureIndexes').val().trim();

    window.PEP.showLoader();

    var data = {
        name: $name.val(),
        description: $description.val(),
        courseId: courseId,
        moduleId: moduleId,
        code: code,
        indexes: indexes
    }

    if (!validateLecture(data)) {
        window.PEP.hideLoader();
        return;
    }

    $.ajax({
        url: '/' + courseId + '/lecture',
        data: data,
        dataType: 'json',
        method: 'POST',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response && response.message) {
                M.toast({ html: response.message, classes: 'green-text' });
                $name.val('');
                $description.val('');
                $('#lectureModal').modal('close');
            }
            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function validateLecture(data) {
    if (!data.name) {
        PEP.Component.alert("name can't be empty.");
        return false;
    }
    if (!data.description) {
        PEP.Component.alert("description can't be empty.");
        return false;
    }
    if (!data.moduleId) {
        PEP.Component.alert("moduleId can't be empty.");
        return false;
    }
    if (!data.code) {
        PEP.Component.alert("code can't be empty.");
        return false;
    }
    if (!data.indexes) {
        PEP.Component.alert("index can't be empty.");
        return false;
    }

    return true;
}

function updateLecture() {
    var id = $(this).attr('id');
    var name = $('#lectureName' + id).val().trim();
    var description = $('#lectureDescription' + id).val().trim();
    var indexes = $('#lectureIndexes' + id).val().trim();
    var moduleId = $('#moduleList' + id + ' option:selected').val();
    var code = name ? convertNameToCode(name) : '';

    var data = {
        name: name,
        description: description,
        courseId: courseId,
        moduleId: moduleId,
        code: code,
        indexes: indexes
    }

    window.PEP.showLoader();

    if (!validateLecture(data)) {
        window.PEP.hideLoader();
        return;
    }

    $.ajax({
        url: '/' + courseId + '/lecture/' + id,
        data: data,
        dataType: 'json',
        method: 'PUT',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response && response.message) {
                M.toast({ html: response.message, classes: 'green-text' });
                $('#lectureModal' + id).modal('close');
            }

            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function confirmDeletionOfLecture() {
    var id = $(this).attr('lect-id');
    if (!id)
        return;

    var isDeleted = $('#isDeleted' + id).val();
    var message = isDeleted == 0 ? 'delete' : 'remap'

    PEP.Component.dialog('Are you sure, you wanna ' + message + ' that lecture?', {
        title: 'Please Confirm',
        modalType: "modal-fixed-footer",
        buttons: {
            close: {
                className: "red white-text",
                text: "close",
                modalClose: true,
            },
            confirm: {
                text: "confirm",
                modalClose: true,
                callback: function () {
                    isDeleted = isDeleted == 0 ? true : false;
                    manageLectureDeletion(id, isDeleted, message);
                }
            }
        }
    });
}

function manageLectureDeletion(id, isDeleted, message) {
    window.PEP.showLoader();
    $.ajax({
        url: '/' + courseId + '/lecture/' + isDeleted + '/' + id,
        dataType: 'json',
        method: 'DELETE',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response.success) {
                var toastMessage = 'lecture ' + message + 'd successfully.';
                M.toast({ html: toastMessage, classes: 'green-text' });
            }

            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function filterBatches() {
    var optionSelected = $("option:selected", this);
    var valueSelected = this.value.trim();
    if (valueSelected == "all") {
        $('.coursesCard').css({ "display": "block" });
        return;
    }
    $(`.coursesCard .courseMasters[value!='${valueSelected}']`).parents(".coursesCard").css({ "display": "none" });
    $(`.coursesCard .courseMasters[value='${valueSelected}']`).parents(".coursesCard").css({ "display": "block" });
}

function convertNameToCode(name) {
    var result = name.replace(/\s/g, '-').toLowerCase();
    return result;
}

function getAllCourseMasters() {
    window.PEP.showLoader();
    $.ajax({
        url: "/getCourseMasters",
        dataType: 'json',
        method: 'get',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response && response.data) {
                $("#batches").empty().append(response.data);
            }
            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function submitReview() {
    var reviewerName = $("#reviewerName").val();
    var reviewText = $("#reviewText").val();
    var reviewStars = $(".rate [name='rate']");
    var starRating = 0;
    for (i = 0; i < reviewStars.length; i++) {
        if (reviewStars[i].checked == true) {
            starRating = reviewStars[i].value;
            break;
        }
    }

    var reviewData = {
        reviewerName: reviewerName,
        reviewText: reviewText,
        starRating: starRating
    }

    window.PEP.showLoader();
    $.ajax({
        url: "/userReviews",
        dataType: 'json',
        method: 'post',
        data: reviewData,
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            if (response.success) {
                var toastMessage = response.message;
                M.toast({ html: toastMessage, classes: 'green-text' });
            }
            $('#reviewModal').modal('close');
            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

function getUserReviews() {
    window.PEP.showLoader();
    $.ajax({
        url: "/userReviews",
        dataType: 'json',
        method: 'get',
        headers: {
            'X-Requested-With': 'XMLHttpRequest'
        },
        success: function (response) {
            $(".userReviews").empty().append(response.data);
            window.PEP.hideLoader();
        },
        error: function (err) {
            window.PEP.handleException(err);
        }
    });
}

$(document).ready(function () {
    if ($("#batches")[0]) {
        getAllCourseMasters();
    }
    if ($(".userReviews")[0]) {
        getUserReviews();
    }

    showStats(1)
    $btnOpenSideNav.on('click', openResourceNav);
    $btnCloseSideNav.on('click', closeResourceNav);

    $(".getallModules").on("click", getAllModules);
    $(".manageLectureDeletion").on("click", confirmDeletionOfLecture);
    $(".frmManageLecture").on("click", '.addLecture', addLecture);
    $(".frmManageLecture").on("click", '.updateLecture', updateLecture);
    $(".batchFilter-dropdown").on("change", filterBatches);
    $(".submitReview").on("click", submitReview);

})