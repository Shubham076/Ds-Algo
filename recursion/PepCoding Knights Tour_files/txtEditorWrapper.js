!function(p,e){function a(t){var i=null,r=null,n=null,a=null,o=null,d=null,s=null;function l(){0!==i._undoIndex?o.addClass("active").removeClass("inactive"):o.addClass("inactive").removeClass("active"),i._undoIndex+1<i._undoStackLength&&i._isInUndoState?d.addClass("active").removeClass("inactive"):d.addClass("inactive").removeClass("active")}function c(e){e&&e.fragment&&p(e.fragment).text(p.trim(p(e.fragment).text()).replace(/\s+/g," "))}function u(e){e&&e.preventDefault&&e.preventDefault();var t=e.dataTransfer.getData("Text");this.insertPlainText(t,!0)}function f(e){i.setTextAlignment(e)}function v(e){i[e]()}function h(){return p.trim(r.text())}function m(){h()?a.addClass("hide"):a.removeClass("hide")}function g(){a.removeClass("hide")}function k(){a.addClass("hide")}function L(){var t=null,e=r.get(0);return e&&e.childNodes&&e.childNodes.length&&p.each(e.childNodes,function(){var e=p(this);p.trim(e.text())&&(t=e)}),t}function b(e){i.saveUndoState();var t=L();t?t.after(e):r.prepend(e),k(),l()}this.Init=function(){n=p("#"+t),a=n.prev(".placeholder");var e=p.trim(n.next(".default-content").html());i=new Squire(n.get(0),{blockTag:"p"}),r=p(i.getRoot()),e?i.setHTML(e):g(),i.addEventListener("focus",k).addEventListener("blur",function(){h()||g(),l()}).addEventListener("willPaste",c).removeEventListener("drop").addEventListener("drop",u),(s=p("#"+t+"_buttons").find("button[data-action]")).on("click",function(){switch(p(this).attr("data-action")){case"alignLeft":f("left");break;case"alignJustify":f("justify");break;case"alignCenter":f("center");break;case"alignRight":f("right");break;case"bold":v(i.hasFormat("b")?"removeBold":"bold");break;case"italic":v(i.hasFormat("i")?"removeItalic":"italic");break;case"underline":v(i.hasFormat("u")?"removeUnderline":"underline");break;case"makeOrderedList":v(i.hasFormat("ol")?"removeList":"makeOrderedList");break;case"makeUnorderedList":v(i.hasFormat("ul")?"removeList":"makeUnorderedList");break;case"code":v("toggleCode");break;case"makeLink":v(i.hasFormat("a")?"removeLink":"makeLink");break;case"insertImage":v("insertImage");break;case"undo":v("undo"),m(),l();break;case"redo":v("redo"),m(),l();break;case"link":i.makeLink(p("#linkURL")[0].value),p("#linkURL")[0].value="";break;case"image":i.insertImage(p("#imageURL")[0].value),p("#imageURL")[0].value=""}}),o=s.find("button[data-action=undo]"),d=s.find("button[data-action=redo]"),a.on("click",function(){i.focus()})},this.GetContent=function(){var e=i.getHTML();if(e){var l=p("<div />").html(e);return function(e){var i,r,t=l.get(0);if(t){var n=(r=[],i=0,function e(t){if(t&&(r.push({node:t,index:i}),i++,t.childNodes&&t.childNodes.length))for(var n=0,a=t.childNodes.length;n<a;n++)e(t.childNodes[n])}(t),r);if(n&&n.length)for(var a=!1,o=n.length-1;-1<o;o--){var d=n[o].node,s=p(d);!a&&p.trim(s.text())&&(a=!0),a&&!s.is("br")||s.remove(),removeTextPlaceholder(s)}}}(),l.html()}return null},this.SetContent=function(e){i.setHTML(p.trim(e)),m()},this.AddHtml=function(e){b(p("<div>"+e+"</div>"))},this.AddParagraph=function(e){b(p("<p>"+e+"</p>"))},this.AddList=function(e){i.saveUndoState();var t=L();if(t)if(t.is("ul")){var n=p("<li>"+e+"</li>");t.append(n)}else{var a=p("<ul><li>"+e+"</li></ul>");t.after(a)}else a=p("<ul><li>"+e+"</li></ul>"),r.prepend(a);k(),l()}}window.PEP.TxtEditor=new function(){var n={};this.Init=function(e,t){n[e]=new a(e),n[e].Init()},this.GetContent=function(e){return n[e].GetContent()},this.SetContent=function(e,t){n[e].SetContent(t)},this.AddParagraph=function(e,t){n[e].AddParagraph(t)},this.AddList=function(e,t){n[e].AddList(t)},this.AddHtml=function(e,t){n[e].AddHtml(t)}}}(window.jQuery);