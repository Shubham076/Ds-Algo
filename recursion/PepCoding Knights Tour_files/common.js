function checkSession(e,t){e.PEP=e.PEP||{},e.PEP,t.ajax({url:"/checkSession/",method:"GET",headers:{"X-Requested-With":"XMLHttpRequest"},success:function(e){e&&console.log(e)},error:function(e){e.responseJSON&&e.responseJSON.message&&window.PEP.handleException(e)}})}!function(t,s){setInterval(function(){checkSession(window,window.jQuery)},9e5),t.PEP=t.PEP||{};var o=t.PEP,e=s("#siteLoader"),n=s("#siteOverlay");function l(e){return e}function a(e){return e}function i(e,t,o){return s.ajax({url:e.url,type:t,data:JSON.stringify(e.data),contentType:"application/json; charset=utf-8",dataType:e.dataType||"json",async:!0,timeout:e.timeout}).then(l,a)}function r(){var e=new XMLHttpRequest;e.onreadystatechange=function(){4==this.readyState&&200==this.status&&location.reload()},e.open("GET","/logout",!0),e.send()}o.User={},o.Routes={baseUrl:window.location.origin},o.socket,o.User.IsSignedIn=function(){return o.User.GetUserUID(),o.User.GetUserRole(),!(!o.User.GetUserUID()||!o.User.GetUserRole())},o.User.GetUserUID=function(){return o.readCookie("userId")},o.User.GetUserRole=function(){return o.readCookie("role")},o.hideLoader=function(){e.addClass("hide"),n.addClass("hide")},o.showLoader=function(){e.removeClass("hide"),n.removeClass("hide")},o.search=function(e,t,o){s("."+e).on("keyup","#"+t,function(){var t=s(this).val().toUpperCase();s("."+e).find("."+o).each(function(e){-1<s(this)[0].innerText.toUpperCase().indexOf(t)?s(this).removeClass("hide"):s(this).addClass("hide")})})},o.getMyNotifications=function(){window.PEP.showLoader(),s.ajax({url:"/notifications/user",dataType:"json",method:"Get",headers:{"X-Requested-With":"XMLHttpRequest"},success:function(e){s("#dropdown1").append(e.data),window.PEP.hideLoader()},error:function(e){console.log(e),window.PEP.hideLoader(),401==e.status&&window.location.reload()}})},o.handleException=function(e){e.responseJSON&&e.responseJSON.message&&M.toast({html:e.responseJSON.message,classes:"toast-error"}),o.hideLoader(),401==e.status&&(location.href="/login")},o.ReplaceSpecialChars=function(e){return(e=(e=e.replace(/\t/g,"\t")).replace(/\n/g,"\r\n")).replace(/'/g,"''")},o.Ajax={},o.Ajax.Get=function(e){return i(e,"GET")},o.Ajax.Post=function(e){return i(e,"POST")},o.createCookie=function(e,t,o){var n="";if(o){var s=new Date;s.setTime(s.getTime()+24*o*60*60*1e3),n="; expires="+s.toGMTString()}else n="";document.cookie=e+"="+t+n+"; path=/"},o.readCookie=function(e){for(var t=e+"=",o=document.cookie.split(";"),n=0;n<o.length;n++){for(var s=o[n];" "==s.charAt(0);)s=s.substring(1,s.length);if(0==s.indexOf(t))return s.substring(t.length,s.length)}return null},o.Utilities=o.Utilities||{},o.Utilities.IsLocalStorageAvailable=function(){try{return localStorage.setItem("test","test"),localStorage.removeItem("test"),!0}catch(e){return!1}},o.Utilities.initSocket=function(){o.socket=io(),o.socket.on("connect",function(){console.log("session-start")})},o.Utilities.getUniqueId=function(){return"_"+Math.random().toString(36).substr(2,9)},o.Utilities.isSessionStorageAvailable=function(){var e=t.sessionStorage;try{return!!e&&(e.setItem("test","1"),e.removeItem("test"),!0)}catch(e){return!1}},o.Utilities.SetItemInLocalStorage=function(e,t){localStorage.setItem(e,t)},o.Utilities.GetItemFromLocalStorage=function(e){return localStorage.getItem(e)},o.Utilities.IsTouchDevice=function(){"ontouchstart"in document.documentElement?document.write("your device is a touch screen device."):document.write("your device is NOT a touch device")},o.Utilities.Throttle=function(t,o){var n=(new Date).getTime();return function(){var e=(new Date).getTime();o<=e-n&&(n=e,t.apply(null,arguments))}},o.Utilities.attatchOnAll=function(e,t,o){if(e&&0<e.length)for(var n=0;n<e.length;n++)e[n].addEventListener(t,o)},o.Utilities.showImagePreview=function(e,n){if(e.files&&e.files[0]){var t=new FileReader;t.onload=function(e){s("#"+n).attr("src",e.target.result);var t=document.getElementById("canvas").getContext("2d"),o=new Image;o.src=e.target.result,o.onload=function(){t.drawImage(o,0,0)}},t.readAsDataURL(e.files[0])}},o.Utilities.signOut=function(){try{r();var e=gapi.auth2.getAuthInstance();e&&e.signOut().then(function(){e.disconnect(),r(),console.log("User signed out.")})}catch(e){console.log("error User signed out."+e)}},o.Utilities.showPreview=function(e){if(e.files[0]){var t=new FileReader;t.onload=function(e){s("#blah").attr("src",e.target.result),s("#targetLayer").html('<img id="preview" alt="course" src="'+e.target.result+'" width="200px" height="180px" class="upload-preview" />')},t.readAsDataURL(e.files[0])}},s("#inputFile").change(function(){readURL(this)}),o.Component={},o.Component.templates,o.Component.templates={alert:"<div class='modal material-alert small'><div class='modal-content'><h3 class='modal-title red-text bold'></h3></div><div class='modal-footer'><div></div>",alertlarge:"<div class='modal material-alert large'><div class='modal-content'><h3 class='modal-title red-text bold'></h3></div><div class='modal-footer'><div></div>",dialog:"<div class='modal material-dialog class_here small'><div class='modal-content'><h4 class='modal-title'>title_here</h4></div><div class='modal-footer'><button class='btn modal-close close close_button_class'>close_button_text</button>&nbsp;<button class='btn modal-close confirm confirm_button_class'>confirm_button_text</button><div></div>"},o.Component.alert=function(e,t){e=void 0!==e?e:"";var o='<button class="btn modal-close button_class close">button_text</button>',n=null,s=t=void 0!==t?t:{};void 0!==t.buttons?void 0!==t.buttons.close&&(o=void 0!==t.buttons.close.text?o.replace("button_text",t.buttons.close.text):o.replace("button_text","Close"),o=void 0!==t.buttons.close.className?o.replace("button_class",t.buttons.close.className):o.replace("button_class",""),void 0!==t.buttons.close.modalClose&&(o=0==t.buttons.close.modalClose?o.replace("modal-close",""):o),void 0!==t.buttons.close.callback&&(n=t.buttons.close.callback)):o=(o=o.replace("button_text","OK")).replace("button_class",""),t={title:void 0!==t.title?t.title:"Alert",footer:void 0!==t.footer?t.footer:"",button:o},document.getElementsByTagName("body")[0].insertAdjacentHTML("beforeend",this.templates.alert);var l=document.getElementsByClassName("material-alert")[document.getElementsByClassName("material-alert").length-1];l.getElementsByClassName("modal-title")[0].textContent=t.title,l.getElementsByClassName("modal-content")[0].insertAdjacentHTML("beforeend",e),l.getElementsByClassName("modal-footer")[0].insertAdjacentHTML("beforeend",t.footer),l.getElementsByClassName("modal-footer")[0].insertAdjacentHTML("beforeend",t.button),M.Modal.init(l,s).open(),n&&l.getElementsByClassName("close")[0].addEventListener("click",function(){n.call()})},o.Component.alertlarge=function(e,t){e=void 0!==e?e:"";var o='<button class="btn modal-close button_class close">button_text</button>',n=null,s=t=void 0!==t?t:{};void 0!==t.buttons?void 0!==t.buttons.close&&(o=void 0!==t.buttons.close.text?o.replace("button_text",t.buttons.close.text):o.replace("button_text","Close"),o=void 0!==t.buttons.close.className?o.replace("button_class",t.buttons.close.className):o.replace("button_class",""),void 0!==t.buttons.close.modalClose&&(o=0==t.buttons.close.modalClose?o.replace("modal-close",""):o),void 0!==t.buttons.close.callback&&(n=t.buttons.close.callback)):o=(o=o.replace("button_text","OK")).replace("button_class",""),t={title:void 0!==t.title?t.title:"Alert",footer:void 0!==t.footer?t.footer:"",button:o},document.getElementsByTagName("body")[0].insertAdjacentHTML("beforeend",this.templates.alertlarge);var l=document.getElementsByClassName("material-alert")[document.getElementsByClassName("material-alert").length-1];l.getElementsByClassName("modal-title")[0].textContent=t.title,l.getElementsByClassName("modal-content")[0].insertAdjacentHTML("beforeend",e),l.getElementsByClassName("modal-footer")[0].insertAdjacentHTML("beforeend",t.footer),l.getElementsByClassName("modal-footer")[0].insertAdjacentHTML("beforeend",t.button),M.Modal.init(l,s).open(),n&&l.getElementsByClassName("close")[0].addEventListener("click",function(){n.call()})},o.Component.replace_close_button=function(e){return(e=e.replace("close_button_text","Close")).replace("close_button_class","red")},o.Component.replace_confirm_button=function(e){return(e=e.replace("confirm_button_text","Confirm")).replace("confirm_button_class","")},o.Component.dialog=function(e,t){e=void 0!==e?e:"";var o=null,n=null,s=t=void 0!==t?t:{},l=this.templates.dialog;l=void 0!==t.title?l.replace("title_here",t.title):l.replace("title_here","Dialog"),l=void 0!==t.modalType?l.replace("class_here",t.modalType):l.replace("class_here",""),void 0!==t.buttons?(void 0!==t.buttons.close?(l=void 0!==t.buttons.close.text?l.replace("close_button_text",t.buttons.close.text):l.replace("close_button_text","Close"),l=void 0!==t.buttons.close.className?l.replace("close_button_class",t.buttons.close.className):l.replace("close_button_class",""),void 0!==t.buttons.close.modalClose&&(l=0==t.buttons.close.modalClose?l.replace("modal-close close","close"):l),void 0!==t.buttons.close.callback&&(o=t.buttons.close.callback)):l=this.replace_close_button(l),void 0!==t.buttons.confirm?(l=void 0!==t.buttons.confirm.text?l.replace("confirm_button_text",t.buttons.confirm.text):l.replace("confirm_button_text","Confirm"),l=void 0!==t.buttons.confirm.className?l.replace("confirm_button_class",t.buttons.confirm.className):l.replace("confirm_button_class",""),void 0!==t.buttons.confirm.modalClose&&(l=0==t.buttons.confirm.modalClose?l.replace("modal-close confirm","confirm"):l),void 0!==t.buttons.confirm.callback&&(n=t.buttons.confirm.callback)):l=this.replace_confirm_button(l)):(l=this.replace_close_button(l),l=this.replace_confirm_button(l)),document.getElementsByTagName("body")[0].insertAdjacentHTML("beforeend",l);var a=document.getElementsByClassName("material-dialog")[document.getElementsByClassName("material-dialog").length-1];a.getElementsByClassName("modal-content")[0].insertAdjacentHTML("beforeend",e),M.Modal.init(a,s).open(),o&&a.getElementsByClassName("close")[0].addEventListener("click",function(){o.call()}),n&&a.getElementsByClassName("confirm")[0].addEventListener("click",function(){n.call()})},o.Resources={},o.Resources.CourseId=function(){return s("input[name=courseId]").val()},o.Resources.LectureId=function(){return s("input[name=lectureId]").val()},o.Resources.ResourceId=function(){return s("input[name=resourceId]").val()},o.Resources.ResourceType=function(){return s("input[name=resourceType]").val()},o.Resources.InitModalPopUp=function(){for(var e=document.querySelectorAll(".modal"),t=0;t<e.length;t++)M.Modal.init(e[t])},s(".dropdown-trigger").dropdown({inDuration:100,outDuration:125,constrain_width:!1,hover:!1,gutter:2*s(".dropdown-content").width()/5.5+5,belowOrigin:!0,alignment:"left",coverTrigger:!1,closeOnClick:!1}),window.PEP.search("search-nav","searchBox","searchRow")}(window,window.jQuery);