(function (win, $) {


    win.PEP = win.PEP || {};
    var PEP = win.PEP;

    $fwdVideo = $('.fwdVideo');
    $payCoinForm = $("#payCoinForm");

    function ojquestionVideoSpeed() {
        var speed = $(this).attr('play-speed');
        var dataTarget = $(this).attr('data-target');
        $(this).parents('.ojquestionVideo').children('video#' + dataTarget)[0].playbackRate = speed;
    }

    $payCoinForm.submit(function (e) {
        e.preventDefault();
        var formData = new FormData(this);
        var form = $(this);
        var method = form.attr('method');
        var url = form.attr('action');

        $.ajax({
            type: method,
            url: url,
            data: formData,
            cache: false,
            contentType: false,
            processData: false,
            success: function (response) {
                if (response && response.data) {
                    $("#resourceContent").html(response.data);
                    $.getScript("/js/bundle/videoPlayer.js?v2.4");
                    $.getScript("/js/bundle/mcq.js?v2.4");
                    $("#resourceNavTabs li").removeClass("disabled");
                    $('.tabs').tabs({
                        onShow: PEP.ResourceEditorInit
                    });
                    if (PEP.User.IsSignedIn()) {
                        window.PEP.ShowCompaniesBadges();
                        window.PEP.showTagBadges();
                    }
                    //  PEP.mcqInit();
                    $('.collapsible').collapsible();
                    $('.fwdVideo').on('click', ojquestionVideoSpeed);
                    $('.fixed-action-btn').floatingActionButton({
                        // hoverEnabled: false
                    });
                }
            },

            error: function (err) {

                // PEP.hideLoader();
                // if (res.status == 401) {

                // }
                window.PEP.handleException(err);
            }
        });
    });

    PEP.ShowCompaniesBadges = function () {
        var questionId = $("#quesId").val();

        if (questionId) {
            $.ajax({
                url: '/company/ojquestion/' + questionId,
                dataType: 'json',
                method: 'GET',
                headers: {
                    'X-Requested-With': 'XMLHttpRequest'
                },
                success: function (response) {
                    if (response && response.data) {
                        $("#companiesSection").removeClass('hide');
                        $('#companiesList').empty().append(response.data);
                    } else {
                        $("#companiesSection").addClass('hide');
                    }
                },
                error: function (err) {
                    window.PEP.handleException(err);
                }
            });
        }
    }

    PEP.showTagBadges = function () {
        var questionId = $("#quesId").val();
        if (!questionId) {
            return;
        }
        $.ajax({
            url: '/tags/ojquestion/' + questionId,
            dataType: 'json',
            method: 'GET',
            headers: {
                'X-Requested-With': 'XMLHttpRequest'
            },
            success: function (response) {
                if (response && response.data) {
                    $("#tagsSection").removeClass('hide');
                    $('#tagList').empty().append(response.data);
                } else {
                    $("#tagsSection").addClass('hide');
                }
            },
            error: function (err) {
                window.PEP.handleException(err);
            }
        });
    }

    function Init() {
        $('.tabs').tabs({
            onShow: PEP.ResourceEditorInit
        });
        $('.modal').modal();
        $('.fixed-action-btn').floatingActionButton({
            // hoverEnabled: false
        });
        $fwdVideo.on('click', ojquestionVideoSpeed);
    }
    Init();

})(window, window.jQuery);