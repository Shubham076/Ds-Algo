(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var aa="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};
function ba(a){a=["object"==typeof globalThis&&globalThis,a,"object"==typeof window&&window,"object"==typeof self&&self,"object"==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error("Cannot find global object");}
var ca=ba(this);function da(a,b){if(b)a:{for(var c=ca,d=a.split("."),e=0;e<d.length-1;e++){var f=d[e];if(!(f in c))break a;c=c[f]}d=d[d.length-1];e=c[d];f=b(e);f!=e&&null!=f&&aa(c,d,{configurable:!0,writable:!0,value:f})}}
var fa="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)Object.prototype.hasOwnProperty.call(d,e)&&(a[e]=d[e])}return a};
da("Object.assign",function(a){return a||fa});
var h=this||self;function ha(a){a=a.split(".");for(var b=h,c=0;c<a.length;c++)if(b=b[a[c]],null==b)return null;return b}
function ia(a){return a}
;var ja=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if("string"===typeof a)return"string"!==typeof b||1!=b.length?-1:a.indexOf(b,0);
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},ka=Array.prototype.filter?function(a,b){return Array.prototype.filter.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=[],e=0,f="string"===typeof a?a.split(""):a,g=0;g<c;g++)if(g in f){var l=f[g];
b.call(void 0,l,g,a)&&(d[e++]=l)}return d};
function la(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c],e=d;var f=typeof e;f="object"!=f?f:e?Array.isArray(e)?"array":f:"null";if("array"==f||"object"==f&&"number"==typeof e.length){e=a.length||0;f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
;var k;a:{var ma=h.navigator;if(ma){var na=ma.userAgent;if(na){k=na;break a}}k=""};var oa="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function pa(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<oa.length;f++)c=oa[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;var qa=-1!=k.toLowerCase().indexOf("webkit")&&-1==k.indexOf("Edge");function m(a,b){this.width=a;this.height=b}
m.prototype.aspectRatio=function(){return this.width/this.height};
m.prototype.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
m.prototype.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
m.prototype.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};/*
 gapi.loader.OBJECT_CREATE_TEST_OVERRIDE &&*/
var p=window,r=document,ra=p.location;function sa(){}
var ta=/\[native code\]/;function t(a,b,c){return a[b]=a[b]||c}
function ua(a){a=a.sort();for(var b=[],c=void 0,d=0;d<a.length;d++){var e=a[d];e!=c&&b.push(e);c=e}return b}
function w(){var a;if((a=Object.create)&&ta.test(a))a=a(null);else{a={};for(var b in a)a[b]=void 0}return a}
var x=t(p,"gapi",{});var z;z=t(p,"___jsl",w());t(z,"I",0);t(z,"hel",10);function va(){var a=ra.href;if(z.dpo)var b=z.h;else{b=z.h;var c=RegExp("([#].*&|[#])jsh=([^&#]*)","g"),d=RegExp("([?#].*&|[?#])jsh=([^&#]*)","g");if(a=a&&(c.exec(a)||d.exec(a)))try{b=decodeURIComponent(a[2])}catch(e){}}return b}
function wa(a){var b=t(z,"PQ",[]);z.PQ=[];var c=b.length;if(0===c)a();else for(var d=0,e=function(){++d===c&&a()},f=0;f<c;f++)b[f](e)}
function xa(a){return t(t(z,"H",w()),a,w())}
;var A=t(z,"perf",w());t(A,"g",w());var ya=t(A,"i",w());t(A,"r",[]);w();w();function B(a,b,c){b&&0<b.length&&(b=za(b),c&&0<c.length&&(b+="___"+za(c)),28<b.length&&(b=b.substr(0,28)+(b.length-28)),c=b,b=t(ya,"_p",w()),t(b,c,w())[a]=(new Date).getTime(),b=A.r,"function"===typeof b?b(a,"_p",c):b.push([a,"_p",c]))}
function za(a){return a.join("__").replace(/\./g,"_").replace(/\-/g,"_").replace(/,/g,"_")}
;var Aa=w(),C=[];function D(a){throw Error("Bad hint"+(a?": "+a:""));}
C.push(["jsl",function(a){for(var b in a)if(Object.prototype.hasOwnProperty.call(a,b)){var c=a[b];"object"==typeof c?z[b]=t(z,b,[]).concat(c):t(z,b,c)}if(b=a.u)a=t(z,"us",[]),a.push(b),(b=/^https:(.*)$/.exec(b))&&a.push("http:"+b[1])}]);
var Ba=/^(\/[a-zA-Z0-9_\-]+)+$/,Ca=[/\/amp\//,/\/amp$/,/^\/amp$/],Da=/^[a-zA-Z0-9\-_\.,!]+$/,Ea=/^gapi\.loaded_[0-9]+$/,Fa=/^[a-zA-Z0-9,._-]+$/;function Ga(a,b,c,d){var e=a.split(";"),f=e.shift(),g=Aa[f],l=null;g?l=g(e,b,c,d):D("no hint processor for: "+f);l||D("failed to generate load url");b=l;c=b.match(Ha);(d=b.match(Ia))&&1===d.length&&Ja.test(b)&&c&&1===c.length||D("failed sanity: "+a);return l}
function Ka(a,b,c,d){function e(f){return encodeURIComponent(f).replace(/%2C/g,",")}
a=La(a);Ea.test(c)||D("invalid_callback");b=Ma(b);d=d&&d.length?Ma(d):null;return[encodeURIComponent(a.pathPrefix).replace(/%2C/g,",").replace(/%2F/g,"/"),"/k=",e(a.version),"/m=",e(b),d?"/exm="+e(d):"","/rt=j/sv=1/d=1/ed=1",a.a?"/am="+e(a.a):"",a.f?"/rs="+e(a.f):"",a.g?"/t="+e(a.g):"","/cb=",e(c)].join("")}
function La(a){"/"!==a.charAt(0)&&D("relative path");for(var b=a.substring(1).split("/"),c=[];b.length;){a=b.shift();if(!a.length||0==a.indexOf("."))D("empty/relative directory");else if(0<a.indexOf("=")){b.unshift(a);break}c.push(a)}a={};for(var d=0,e=b.length;d<e;++d){var f=b[d].split("="),g=decodeURIComponent(f[0]),l=decodeURIComponent(f[1]);2==f.length&&g&&l&&(a[g]=a[g]||l)}b="/"+c.join("/");Ba.test(b)||D("invalid_prefix");c=0;for(d=Ca.length;c<d;++c)Ca[c].test(b)&&D("invalid_prefix");c=E(a,"k",
!0);d=E(a,"am");e=E(a,"rs");a=E(a,"t");return{pathPrefix:b,version:c,a:d,f:e,g:a}}
function Ma(a){for(var b=[],c=0,d=a.length;c<d;++c){var e=a[c].replace(/\./g,"_").replace(/-/g,"_");Fa.test(e)&&b.push(e)}return b.join(",")}
function E(a,b,c){a=a[b];!a&&c&&D("missing: "+b);if(a){if(Da.test(a))return a;D("invalid: "+b)}return null}
var Ja=/^https?:\/\/[a-z0-9_.-]+\.google(rs)?\.com(:\d+)?\/[a-zA-Z0-9_.,!=\-\/]+$/,Ia=/\/cb=/g,Ha=/\/\//g;function Na(){var a=va();if(!a)throw Error("Bad hint");return a}
Aa.m=function(a,b,c,d){(a=a[0])||D("missing_hint");return"https://apis.google.com"+Ka(a,b,c,d)};
var I=decodeURI("%73cript"),Oa=/^[-+_0-9\/A-Za-z]+={0,2}$/;function Pa(a,b){for(var c=[],d=0;d<a.length;++d){var e=a[d],f;if(f=e){a:{for(f=0;f<b.length;f++)if(b[f]===e)break a;f=-1}f=0>f}f&&c.push(e)}return c}
function Qa(){var a=z.nonce;return void 0!==a?a&&a===String(a)&&a.match(Oa)?a:z.nonce=null:r.querySelector?(a=r.querySelector("script[nonce]"))?(a=a.nonce||a.getAttribute("nonce")||"",a&&a===String(a)&&a.match(Oa)?z.nonce=a:z.nonce=null):null:null}
function Ra(a){if("loading"!=r.readyState)Sa(a);else{var b=Qa(),c="";null!==b&&(c=' nonce="'+b+'"');a="<"+I+' src="'+encodeURI(a)+'"'+c+"></"+I+">";r.write(J?J.createHTML(a):a)}}
function Sa(a){var b=r.createElement(I);b.setAttribute("src",J?J.createScriptURL(a):a);a=Qa();null!==a&&b.setAttribute("nonce",a);b.async="true";(a=r.getElementsByTagName(I)[0])?a.parentNode.insertBefore(b,a):(r.head||r.body||r.documentElement).appendChild(b)}
function Ta(a,b){var c=b&&b._c;if(c)for(var d=0;d<C.length;d++){var e=C[d][0],f=C[d][1];f&&Object.prototype.hasOwnProperty.call(c,e)&&f(c[e],a,b)}}
function Ua(a,b,c){Va(function(){var d=b===va()?t(x,"_",w()):w();d=t(xa(b),"_",d);a(d)},c)}
function Wa(a,b){var c=b||{};"function"==typeof b&&(c={},c.callback=b);Ta(a,c);var d=a?a.split(":"):[],e=c.h||Na(),f=t(z,"ah",w());if(f["::"]&&d.length){for(var g=[],l=null;l=d.shift();){var n=l.split(".");n=f[l]||f[n[1]&&"ns:"+n[0]||""]||e;var F=g.length&&g[g.length-1]||null,G=F;F&&F.hint==n||(G={hint:n,b:[]},g.push(G));G.b.push(l)}var K=g.length;if(1<K){var H=c.callback;H&&(c.callback=function(){0==--K&&H()})}for(;d=g.shift();)Xa(d.b,c,d.hint)}else Xa(d||[],c,e)}
function Xa(a,b,c){function d(y,L){if(K)return 0;p.clearTimeout(G);H.push.apply(H,q);var M=((x||{}).config||{}).update;M?M(f):f&&t(z,"cu",[]).push(f);if(L){B("me0",y,W);try{Ua(L,c,F)}finally{B("me1",y,W)}}return 1}
a=ua(a)||[];var e=b.callback,f=b.config,g=b.timeout,l=b.ontimeout,n=b.onerror,F=void 0;"function"==typeof n&&(F=n);var G=null,K=!1;if(g&&!l||!g&&l)throw"Timeout requires both the timeout parameter and ontimeout parameter to be set";n=t(xa(c),"r",[]).sort();var H=t(xa(c),"L",[]).sort(),W=[].concat(n);0<g&&(G=p.setTimeout(function(){K=!0;l()},g));
var q=Pa(a,H);if(q.length){q=Pa(a,n);var u=t(z,"CP",[]),v=u.length;u[v]=function(y){function L(){var X=u[v+1];X&&X()}
function M(X){u[v]=null;d(q,y)&&wa(function(){e&&e();X()})}
if(!y)return 0;B("ml1",q,W);0<v&&u[v-1]?u[v]=function(){M(L)}:M(L)};
if(q.length){var ea="loaded_"+z.I++;x[ea]=function(y){u[v](y);x[ea]=null};
a=Ga(c,q,"gapi."+ea,n);n.push.apply(n,q);B("ml0",q,W);b.sync||p.___gapisync?Ra(a):Sa(a)}else u[v](sa)}else d(q)&&e&&e()}
var Ya;var Za=null,$a=h.trustedTypes;if($a&&$a.createPolicy){try{Za=$a.createPolicy("goog#gapi",{createHTML:ia,createScript:ia,createScriptURL:ia})}catch(a){h.console&&h.console.error(a.message)}Ya=Za}else Ya=Za;var J=Ya;function Va(a,b){if(z.hee&&0<z.hel)try{return a()}catch(c){b&&b(c),z.hel--,Wa("debug_error",function(){try{window.___jsl.hefn(c)}catch(d){throw c;}})}else try{return a()}catch(c){throw b&&b(c),c;
}}
x.load=function(a,b){return Va(function(){return Wa(a,b)})};function ab(a){return"string"==typeof a.className?a.className:a.getAttribute&&a.getAttribute("class")||""}
function bb(a,b){"string"==typeof a.className?a.className=b:a.setAttribute&&a.setAttribute("class",b)}
function cb(a,b){if(a.classList)var c=a.classList.contains(b);else c=a.classList?a.classList:ab(a).match(/\S+/g)||[],c=0<=ja(c,b);return c}
function db(a,b){if(a.classList)a.classList.add(b);else if(!cb(a,b)){var c=ab(a);bb(a,c+(0<c.length?" "+b:b))}}
function eb(a,b){a.classList?a.classList.remove(b):cb(a,b)&&bb(a,ka(a.classList?a.classList:ab(a).match(/\S+/g)||[],function(c){return c!=b}).join(" "))}
;function fb(a){var b=a.offsetWidth,c=a.offsetHeight,d=qa&&!b&&!c;if((void 0===b||d)&&a.getBoundingClientRect){try{var e=a.getBoundingClientRect()}catch(f){e={left:0,top:0,right:0,bottom:0}}return new m(e.right-e.left,e.bottom-e.top)}return new m(b,c)}
;var N=window.yt&&window.yt.config_||window.ytcfg&&window.ytcfg.data_||{},O=["yt","config_"],P=h;O[0]in P||"undefined"==typeof P.execScript||P.execScript("var "+O[0]);for(var Q;O.length&&(Q=O.shift());)O.length||void 0===N?P[Q]&&P[Q]!==Object.prototype[Q]?P=P[Q]:P=P[Q]={}:P[Q]=N;function gb(a){var b=arguments;1<b.length?N[b[0]]=b[1]:1===b.length&&Object.assign(N,b[0])}
;function hb(){return ha("gapi.iframes.getContext")()}
function ib(){return ha("gapi.iframes.SAME_ORIGIN_IFRAMES_FILTER")}
;function jb(a){try{a.register("msg-hovercard-subscription",kb,ib())}catch(b){}}
function kb(a){if(a){a=!!a.isSubscribed;var b=document.getElementById("yt-subscribe-card");a?eb(b,"subscribe"):db(b,"subscribe");a?db(b,"subscribed"):eb(b,"subscribed")}}
;function R(){var a=document.getElementById("yt-subscribe-card");b:{var b=9==a.nodeType?a:a.ownerDocument||a.document;if(b.defaultView&&b.defaultView.getComputedStyle&&(b=b.defaultView.getComputedStyle(a,null))){b=b.display||b.getPropertyValue("display")||"";break b}b=""}if("none"!=(b||(a.currentStyle?a.currentStyle.display:null)||a.style&&a.style.display))a=fb(a);else{b=a.style;var c=b.display,d=b.visibility,e=b.position;b.visibility="hidden";b.position="absolute";b.display="inline";a=fb(a);b.display=
c;b.position=e;b.visibility=d}a={width:a.width,height:a.height};hb().ready(a,null,void 0);a=ib();hb().addOnOpenerHandler(jb,null,a)}
var S=R;S=void 0===S?{}:S;"function"===typeof S&&(S={callback:S});R=S;var lb;(lb=R.gapiHintOverride)||(lb="GAPI_HINT_OVERRIDE"in N?N.GAPI_HINT_OVERRIDE:void 0);
if(lb){var mb;var T=document.location.href;if(-1!=T.indexOf("?")){T=(T||"").split("#")[0];var nb=T.split("?",2),U=1<nb.length?nb[1]:nb[0];"?"==U.charAt(0)&&(U=U.substr(1));for(var ob=U.split("&"),V={},pb=0,qb=ob.length;pb<qb;pb++){var Y=ob[pb].split("=");if(1==Y.length&&Y[0]||2==Y.length)try{var Z=decodeURIComponent((Y[0]||"").replace(/\+/g," ")),rb=decodeURIComponent((Y[1]||"").replace(/\+/g," "));Z in V?Array.isArray(V[Z])?la(V[Z],rb):V[Z]=[V[Z],rb]:V[Z]=rb}catch(a){if("q"!=Y[0]){var sb=Error("Error decoding URL component");
sb.params={key:Y[0],value:Y[1]};var tb=ha("yt.logging.errors.log");if(tb)tb(sb,"ERROR",void 0,void 0,void 0);else{var ub,vb=[];ub="ERRORS"in N?N.ERRORS:vb;ub.push([sb,"ERROR",void 0,void 0,void 0]);gb("ERRORS",ub)}}}}mb=V}else mb={};var wb=mb.gapi_jsh;wb&&pa(R,{_c:{jsl:{h:wb}}})}Wa("gapi.iframes:gapi.iframes.style.common",R);}).call(this);
