(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var m;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}
var ba="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};
function ca(a){a=["object"==typeof globalThis&&globalThis,a,"object"==typeof window&&window,"object"==typeof self&&self,"object"==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error("Cannot find global object");}
var da=ca(this);function t(a,b){if(b)a:{for(var c=da,d=a.split("."),e=0;e<d.length-1;e++){var f=d[e];if(!(f in c))break a;c=c[f]}d=d[d.length-1];e=c[d];f=b(e);f!=e&&null!=f&&ba(c,d,{configurable:!0,writable:!0,value:f})}}
t("Symbol",function(a){function b(e){if(this instanceof b)throw new TypeError("Symbol is not a constructor");return new c("jscomp_symbol_"+(e||"")+"_"+d++,e)}
function c(e,f){this.f=e;ba(this,"description",{configurable:!0,writable:!0,value:f})}
if(a)return a;c.prototype.toString=function(){return this.f};
var d=0;return b});
t("Symbol.iterator",function(a){if(a)return a;a=Symbol("Symbol.iterator");for(var b="Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array".split(" "),c=0;c<b.length;c++){var d=da[b[c]];"function"===typeof d&&"function"!=typeof d.prototype[a]&&ba(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ea(aa(this))}})}return a});
function ea(a){a={next:a};a[Symbol.iterator]=function(){return this};
return a}
function v(a){var b="undefined"!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];return b?b.call(a):{next:aa(a)}}
function fa(a){for(var b,c=[];!(b=a.next()).done;)c.push(b.value);return c}
function ha(a){return a instanceof Array?a:fa(v(a))}
var ia="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},ja=function(){function a(){function c(){}
new c;Reflect.construct(c,[],function(){});
return new c instanceof c}
if("undefined"!=typeof Reflect&&Reflect.construct){if(a())return Reflect.construct;var b=Reflect.construct;return function(c,d,e){c=b(c,d);e&&Reflect.setPrototypeOf(c,e.prototype);return c}}return function(c,d,e){void 0===e&&(e=c);
e=ia(e.prototype||Object.prototype);return Function.prototype.apply.call(c,e,d)||e}}(),ka;
if("function"==typeof Object.setPrototypeOf)ka=Object.setPrototypeOf;else{var la;a:{var ma={a:!0},oa={};try{oa.__proto__=ma;la=oa.a;break a}catch(a){}la=!1}ka=la?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}var pa=ka;
function qa(a,b){a.prototype=ia(b.prototype);a.prototype.constructor=a;if(pa)pa(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.D=b.prototype}
function ra(){this.A=!1;this.j=null;this.g=void 0;this.f=1;this.o=this.v=0;this.F=this.i=null}
function sa(a){if(a.A)throw new TypeError("Generator is already running");a.A=!0}
ra.prototype.B=function(a){this.g=a};
function ta(a,b){a.i={sb:b,Ja:!0};a.f=a.v||a.o}
ra.prototype["return"]=function(a){this.i={"return":a};this.f=this.o};
function w(a,b,c){a.f=c;return{value:b}}
ra.prototype.N=function(a){this.f=a};
function ua(a){a.v=2;a.o=3}
function va(a){a.v=0;a.i=null}
function wa(a){a.F=[a.i];a.v=0;a.o=0}
function xa(a){var b=a.F.splice(0)[0];(b=a.i=a.i||b)?b.Ja?a.f=a.v||a.o:void 0!=b.N&&a.o<b.N?(a.f=b.N,a.i=null):a.f=a.o:a.f=0}
function ya(a){this.f=new ra;this.g=a}
function za(a,b){sa(a.f);var c=a.f.j;if(c)return Aa(a,"return"in c?c["return"]:function(d){return{value:d,done:!0}},b,a.f["return"]);
a.f["return"](b);return Ba(a)}
function Aa(a,b,c,d){try{var e=b.call(a.f.j,c);if(!(e instanceof Object))throw new TypeError("Iterator result "+e+" is not an object");if(!e.done)return a.f.A=!1,e;var f=e.value}catch(g){return a.f.j=null,ta(a.f,g),Ba(a)}a.f.j=null;d.call(a.f,f);return Ba(a)}
function Ba(a){for(;a.f.f;)try{var b=a.g(a.f);if(b)return a.f.A=!1,{value:b.value,done:!1}}catch(c){a.f.g=void 0,ta(a.f,c)}a.f.A=!1;if(a.f.i){b=a.f.i;a.f.i=null;if(b.Ja)throw b.sb;return{value:b["return"],done:!0}}return{value:void 0,done:!0}}
function Ca(a){this.next=function(b){sa(a.f);a.f.j?b=Aa(a,a.f.j.next,b,a.f.B):(a.f.B(b),b=Ba(a));return b};
this["throw"]=function(b){sa(a.f);a.f.j?b=Aa(a,a.f.j["throw"],b,a.f.B):(ta(a.f,b),b=Ba(a));return b};
this["return"]=function(b){return za(a,b)};
this[Symbol.iterator]=function(){return this}}
function Da(a,b){var c=new Ca(new ya(b));pa&&a.prototype&&pa(c,a.prototype);return c}
t("Reflect",function(a){return a?a:{}});
t("Reflect.construct",function(){return ja});
t("Reflect.setPrototypeOf",function(a){return a?a:pa?function(b,c){try{return pa(b,c),!0}catch(d){return!1}}:null});
function Ea(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
t("WeakMap",function(a){function b(k){this.f=(h+=Math.random()+1).toString();if(k){k=v(k);for(var l;!(l=k.next()).done;)l=l.value,this.set(l[0],l[1])}}
function c(){}
function d(k){var l=typeof k;return"object"===l&&null!==k||"function"===l}
function e(k){if(!Ea(k,g)){var l=new c;ba(k,g,{value:l})}}
function f(k){var l=Object[k];l&&(Object[k]=function(n){if(n instanceof c)return n;Object.isExtensible(n)&&e(n);return l(n)})}
if(function(){if(!a||!Object.seal)return!1;try{var k=Object.seal({}),l=Object.seal({}),n=new a([[k,2],[l,3]]);if(2!=n.get(k)||3!=n.get(l))return!1;n["delete"](k);n.set(l,4);return!n.has(k)&&4==n.get(l)}catch(p){return!1}}())return a;
var g="$jscomp_hidden_"+Math.random();f("freeze");f("preventExtensions");f("seal");var h=0;b.prototype.set=function(k,l){if(!d(k))throw Error("Invalid WeakMap key");e(k);if(!Ea(k,g))throw Error("WeakMap key fail: "+k);k[g][this.f]=l;return this};
b.prototype.get=function(k){return d(k)&&Ea(k,g)?k[g][this.f]:void 0};
b.prototype.has=function(k){return d(k)&&Ea(k,g)&&Ea(k[g],this.f)};
b.prototype["delete"]=function(k){return d(k)&&Ea(k,g)&&Ea(k[g],this.f)?delete k[g][this.f]:!1};
return b});
t("Map",function(a){function b(){var h={};return h.previous=h.next=h.head=h}
function c(h,k){var l=h.f;return ea(function(){if(l){for(;l.head!=h.f;)l=l.previous;for(;l.next!=l.head;)return l=l.next,{done:!1,value:k(l)};l=null}return{done:!0,value:void 0}})}
function d(h,k){var l=k&&typeof k;"object"==l||"function"==l?f.has(k)?l=f.get(k):(l=""+ ++g,f.set(k,l)):l="p_"+k;var n=h.g[l];if(n&&Ea(h.g,l))for(var p=0;p<n.length;p++){var q=n[p];if(k!==k&&q.key!==q.key||k===q.key)return{id:l,list:n,index:p,H:q}}return{id:l,list:n,index:-1,H:void 0}}
function e(h){this.g={};this.f=b();this.size=0;if(h){h=v(h);for(var k;!(k=h.next()).done;)k=k.value,this.set(k[0],k[1])}}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var h=Object.seal({x:4}),k=new a(v([[h,"s"]]));if("s"!=k.get(h)||1!=k.size||k.get({x:4})||k.set({x:4},"t")!=k||2!=k.size)return!1;var l=k.entries(),n=l.next();if(n.done||n.value[0]!=h||"s"!=n.value[1])return!1;n=l.next();return n.done||4!=n.value[0].x||"t"!=n.value[1]||!l.next().done?!1:!0}catch(p){return!1}}())return a;
var f=new WeakMap;e.prototype.set=function(h,k){h=0===h?0:h;var l=d(this,h);l.list||(l.list=this.g[l.id]=[]);l.H?l.H.value=k:(l.H={next:this.f,previous:this.f.previous,head:this.f,key:h,value:k},l.list.push(l.H),this.f.previous.next=l.H,this.f.previous=l.H,this.size++);return this};
e.prototype["delete"]=function(h){h=d(this,h);return h.H&&h.list?(h.list.splice(h.index,1),h.list.length||delete this.g[h.id],h.H.previous.next=h.H.next,h.H.next.previous=h.H.previous,h.H.head=null,this.size--,!0):!1};
e.prototype.clear=function(){this.g={};this.f=this.f.previous=b();this.size=0};
e.prototype.has=function(h){return!!d(this,h).H};
e.prototype.get=function(h){return(h=d(this,h).H)&&h.value};
e.prototype.entries=function(){return c(this,function(h){return[h.key,h.value]})};
e.prototype.keys=function(){return c(this,function(h){return h.key})};
e.prototype.values=function(){return c(this,function(h){return h.value})};
e.prototype.forEach=function(h,k){for(var l=this.entries(),n;!(n=l.next()).done;)n=n.value,h.call(k,n[1],n[0],this)};
e.prototype[Symbol.iterator]=e.prototype.entries;var g=0;return e});
function Fa(a,b){a instanceof String&&(a+="");var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};
e[Symbol.iterator]=function(){return e};
return e}
t("Array.prototype.keys",function(a){return a?a:function(){return Fa(this,function(b){return b})}});
function Ga(a,b,c){if(null==a)throw new TypeError("The 'this' value for String.prototype."+c+" must not be null or undefined");if(b instanceof RegExp)throw new TypeError("First argument to String.prototype."+c+" must not be a regular expression");return a+""}
t("String.prototype.endsWith",function(a){return a?a:function(b,c){var d=Ga(this,b,"endsWith");b+="";void 0===c&&(c=d.length);for(var e=Math.max(0,Math.min(c|0,d.length)),f=b.length;0<f&&0<e;)if(d[--e]!=b[--f])return!1;return 0>=f}});
t("String.prototype.startsWith",function(a){return a?a:function(b,c){var d=Ga(this,b,"startsWith");b+="";for(var e=d.length,f=b.length,g=Math.max(0,Math.min(c|0,d.length)),h=0;h<f&&g<e;)if(d[g++]!=b[h++])return!1;return h>=f}});
t("Set",function(a){function b(c){this.f=new Map;if(c){c=v(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.f.size}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(v([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||f.value[1]!=f.value[0]?!1:e.next().done}catch(g){return!1}}())return a;
b.prototype.add=function(c){c=0===c?0:c;this.f.set(c,c);this.size=this.f.size;return this};
b.prototype["delete"]=function(c){c=this.f["delete"](c);this.size=this.f.size;return c};
b.prototype.clear=function(){this.f.clear();this.size=0};
b.prototype.has=function(c){return this.f.has(c)};
b.prototype.entries=function(){return this.f.entries()};
b.prototype.values=function(){return this.f.values()};
b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=b.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.f.forEach(function(f){return c.call(d,f,f,e)})};
return b});
t("Array.prototype.values",function(a){return a?a:function(){return Fa(this,function(b,c){return c})}});
t("Object.setPrototypeOf",function(a){return a||pa});
var Ha="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)Ea(d,e)&&(a[e]=d[e])}return a};
t("Object.assign",function(a){return a||Ha});
t("Promise",function(a){function b(g){this.g=0;this.i=void 0;this.f=[];var h=this.j();try{g(h.resolve,h.reject)}catch(k){h.reject(k)}}
function c(){this.f=null}
function d(g){return g instanceof b?g:new b(function(h){h(g)})}
if(a)return a;c.prototype.g=function(g){if(null==this.f){this.f=[];var h=this;this.i(function(){h.o()})}this.f.push(g)};
var e=da.setTimeout;c.prototype.i=function(g){e(g,0)};
c.prototype.o=function(){for(;this.f&&this.f.length;){var g=this.f;this.f=[];for(var h=0;h<g.length;++h){var k=g[h];g[h]=null;try{k()}catch(l){this.j(l)}}}this.f=null};
c.prototype.j=function(g){this.i(function(){throw g;})};
b.prototype.j=function(){function g(l){return function(n){k||(k=!0,l.call(h,n))}}
var h=this,k=!1;return{resolve:g(this.O),reject:g(this.o)}};
b.prototype.O=function(g){if(g===this)this.o(new TypeError("A Promise cannot resolve to itself"));else if(g instanceof b)this.da(g);else{a:switch(typeof g){case "object":var h=null!=g;break a;case "function":h=!0;break a;default:h=!1}h?this.F(g):this.v(g)}};
b.prototype.F=function(g){var h=void 0;try{h=g.then}catch(k){this.o(k);return}"function"==typeof h?this.ma(h,g):this.v(g)};
b.prototype.o=function(g){this.A(2,g)};
b.prototype.v=function(g){this.A(1,g)};
b.prototype.A=function(g,h){if(0!=this.g)throw Error("Cannot settle("+g+", "+h+"): Promise already settled in state"+this.g);this.g=g;this.i=h;this.B()};
b.prototype.B=function(){if(null!=this.f){for(var g=0;g<this.f.length;++g)f.g(this.f[g]);this.f=null}};
var f=new c;b.prototype.da=function(g){var h=this.j();g.fa(h.resolve,h.reject)};
b.prototype.ma=function(g,h){var k=this.j();try{g.call(h,k.resolve,k.reject)}catch(l){k.reject(l)}};
b.prototype.then=function(g,h){function k(q,r){return"function"==typeof q?function(u){try{l(q(u))}catch(B){n(B)}}:r}
var l,n,p=new b(function(q,r){l=q;n=r});
this.fa(k(g,l),k(h,n));return p};
b.prototype["catch"]=function(g){return this.then(void 0,g)};
b.prototype.fa=function(g,h){function k(){switch(l.g){case 1:g(l.i);break;case 2:h(l.i);break;default:throw Error("Unexpected state: "+l.g);}}
var l=this;null==this.f?f.g(k):this.f.push(k)};
b.resolve=d;b.reject=function(g){return new b(function(h,k){k(g)})};
b.race=function(g){return new b(function(h,k){for(var l=v(g),n=l.next();!n.done;n=l.next())d(n.value).fa(h,k)})};
b.all=function(g){var h=v(g),k=h.next();return k.done?d([]):new b(function(l,n){function p(u){return function(B){q[u]=B;r--;0==r&&l(q)}}
var q=[],r=0;do q.push(void 0),r++,d(k.value).fa(p(q.length-1),n),k=h.next();while(!k.done)})};
return b});
t("Object.is",function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});
t("Array.prototype.includes",function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length,f=c||0;for(0>f&&(f=Math.max(f+e,0));f<e;f++){var g=d[f];if(g===b||Object.is(g,b))return!0}return!1}});
t("String.prototype.includes",function(a){return a?a:function(b,c){return-1!==Ga(this,b,"includes").indexOf(b,c||0)}});
t("Array.prototype.entries",function(a){return a?a:function(){return Fa(this,function(b,c){return[b,c]})}});
t("Object.entries",function(a){return a?a:function(b){var c=[],d;for(d in b)Ea(b,d)&&c.push([d,b[d]]);return c}});
var x=this||self;function y(a,b){for(var c=a.split("."),d=b||x,e=0;e<c.length;e++)if(d=d[c[e]],null==d)return null;return d}
function Ia(){}
function Ja(a){a.qa=void 0;a.C=function(){return a.qa?a.qa:a.qa=new a}}
function Ka(a){var b=typeof a;return"object"!=b?b:a?Array.isArray(a)?"array":b:"null"}
function La(a){var b=Ka(a);return"array"==b||"object"==b&&"number"==typeof a.length}
function Ma(a){return"function"==Ka(a)}
function Oa(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
function Pa(a){return Object.prototype.hasOwnProperty.call(a,Qa)&&a[Qa]||(a[Qa]=++Ra)}
var Qa="closure_uid_"+(1E9*Math.random()>>>0),Ra=0;function Sa(a,b,c){return a.call.apply(a.bind,arguments)}
function Ta(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var e=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(e,d);return a.apply(b,e)}}return function(){return a.apply(b,arguments)}}
function z(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?z=Sa:z=Ta;return z.apply(null,arguments)}
function Ua(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var d=c.slice();d.push.apply(d,arguments);return a.apply(this,d)}}
var Va=Date.now;function A(a,b){var c=a.split("."),d=x;c[0]in d||"undefined"==typeof d.execScript||d.execScript("var "+c[0]);for(var e;c.length&&(e=c.shift());)c.length||void 0===b?d[e]&&d[e]!==Object.prototype[e]?d=d[e]:d=d[e]={}:d[e]=b}
function D(a,b){function c(){}
c.prototype=b.prototype;a.D=b.prototype;a.prototype=new c;a.prototype.constructor=a}
function Wa(a){return a}
function Xa(a){var b=null,c=x.trustedTypes;if(!c||!c.createPolicy)return b;try{b=c.createPolicy(a,{createHTML:Wa,createScript:Wa,createScriptURL:Wa})}catch(d){x.console&&x.console.error(d.message)}return b}
;function Ya(a){this.ya=a}
;function Za(a,b,c){this.j=a;this.g=b;this.f=c||[];this.Z=new Map}
m=Za.prototype;m.Tb=function(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];this.Z.set(this.Fa(c),[new Ya(a)])};
m.Ea=function(a){for(var b=[],c=0;c<arguments.length;++c)b[c-0]=arguments[c];b=this.Fa(b);return this.Z.has(b)?this.Z.get(b):void 0};
m.ub=function(a){for(var b=[],c=0;c<arguments.length;++c)b[c-0]=arguments[c];return(b=this.Ea(b))&&b.length?b[0]:void 0};
m.clear=function(){this.Z.clear()};
m.Fa=function(a){for(var b=[],c=0;c<arguments.length;++c)b[c-0]=arguments[c];return b?b.join(","):"key"};function $a(a,b){Za.call(this,a,3,b)}
qa($a,Za);$a.prototype.i=function(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];d=0;var e=this.ub(c);e&&(d=e.ya);this.Tb(d+a,c)};function ab(a){if(Error.captureStackTrace)Error.captureStackTrace(this,ab);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}
D(ab,Error);ab.prototype.name="CustomError";var bb;function cb(){this.i=this.i;this.o=this.o}
cb.prototype.i=!1;cb.prototype.ia=function(){return this.i};
cb.prototype.dispose=function(){this.i||(this.i=!0,this.S())};
cb.prototype.S=function(){if(this.o)for(;this.o.length;)this.o.shift()()};
function db(a){a&&"function"==typeof a.dispose&&a.dispose()}
;function eb(a,b){this.type=a;this.currentTarget=this.target=b;this.defaultPrevented=this.f=!1}
eb.prototype.stopPropagation=function(){this.f=!0};
eb.prototype.preventDefault=function(){this.defaultPrevented=!0};var fb=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if("string"===typeof a)return"string"!==typeof b||1!=b.length?-1:a.indexOf(b,0);
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},E=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e="string"===typeof a?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},gb=Array.prototype.filter?function(a,b,c){return Array.prototype.filter.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=[],f=0,g="string"===typeof a?a.split(""):a,h=0;h<d;h++)if(h in g){var k=g[h];
b.call(c,k,h,a)&&(e[f++]=k)}return e},hb=Array.prototype.map?function(a,b){return Array.prototype.map.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=Array(c),e="string"===typeof a?a.split(""):a,f=0;f<c;f++)f in e&&(d[f]=b.call(void 0,e[f],f,a));
return d},ib=Array.prototype.reduce?function(a,b,c){return Array.prototype.reduce.call(a,b,c)}:function(a,b,c){var d=c;
E(a,function(e,f){d=b.call(void 0,d,e,f,a)});
return d},jb=Array.prototype.some?function(a,b){return Array.prototype.some.call(a,b,void 0)}:function(a,b){for(var c=a.length,d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;
return!1};
function kb(a,b){a:{var c=a.length;for(var d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?null:"string"===typeof a?a.charAt(c):a[c]}
function lb(a,b){return 0<=fb(a,b)}
function mb(a,b){var c=fb(a,b),d;(d=0<=c)&&Array.prototype.splice.call(a,c,1);return d}
function nb(a){return Array.prototype.concat.apply([],arguments)}
function ob(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return c}return[]}
function pb(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(La(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
function qb(a,b,c,d){return Array.prototype.splice.apply(a,rb(arguments,1))}
function rb(a,b,c){return 2>=arguments.length?Array.prototype.slice.call(a,b):Array.prototype.slice.call(a,b,c)}
function sb(a){for(var b=[],c=0;c<arguments.length;c++){var d=arguments[c];if(Array.isArray(d))for(var e=0;e<d.length;e+=8192){var f=rb(d,e,e+8192);f=sb.apply(null,f);for(var g=0;g<f.length;g++)b.push(f[g])}else b.push(d)}return b}
;var tb=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]};
function ub(a,b){for(var c=0,d=tb(String(a)).split("."),e=tb(String(b)).split("."),f=Math.max(d.length,e.length),g=0;0==c&&g<f;g++){var h=d[g]||"",k=e[g]||"";do{h=/(\d*)(\D*)(.*)/.exec(h)||["","","",""];k=/(\d*)(\D*)(.*)/.exec(k)||["","","",""];if(0==h[0].length&&0==k[0].length)break;c=vb(0==h[1].length?0:parseInt(h[1],10),0==k[1].length?0:parseInt(k[1],10))||vb(0==h[2].length,0==k[2].length)||vb(h[2],k[2]);h=h[3];k=k[3]}while(0==c)}return c}
function vb(a,b){return a<b?-1:a>b?1:0}
;var wb;a:{var xb=x.navigator;if(xb){var yb=xb.userAgent;if(yb){wb=yb;break a}}wb=""}function F(a){return-1!=wb.indexOf(a)}
;function zb(a,b,c){for(var d in a)b.call(c,a[d],d,a)}
function Ab(a){var b=[],c=0,d;for(d in a)b[c++]=a[d];return b}
function Bb(a){var b=Cb,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
function Db(a,b){for(var c in a)if(!(c in b)||a[c]!==b[c])return!1;for(var d in b)if(!(d in a))return!1;return!0}
function Eb(a){var b=Ka(a);if("object"==b||"array"==b){if(Ma(a.clone))return a.clone();b="array"==b?[]:{};for(var c in a)b[c]=Eb(a[c]);return b}return a}
var Fb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function Gb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<Fb.length;f++)c=Fb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;function Hb(){return F("Firefox")||F("FxiOS")}
function Ib(){return F("Safari")&&!(Jb()||F("Coast")||F("Opera")||F("Edge")||F("Edg/")||F("OPR")||Hb()||F("Silk")||F("Android"))}
function Jb(){return(F("Chrome")||F("CriOS"))&&!F("Edge")}
function Kb(){return F("Android")&&!(Jb()||Hb()||F("Opera")||F("Silk"))}
;function Lb(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}
;var Mb;function Nb(a,b){this.f=b===Ob?a:""}
Nb.prototype.pa=!0;Nb.prototype.oa=function(){return this.f.toString()};
var Pb=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,Ob={};function Qb(a,b,c){this.f=c===Sb?a:""}
Qb.prototype.pa=!0;Qb.prototype.oa=function(){return this.f.toString()};
function Tb(a){if(a instanceof Qb&&a.constructor===Qb)return a.f;Ka(a);return"type_error:SafeHtml"}
var Sb={},Ub=new Qb(x.trustedTypes&&x.trustedTypes.emptyHTML||"",0,Sb);var Vb=Lb(function(){var a=document.createElement("div"),b=document.createElement("div");b.appendChild(document.createElement("div"));a.appendChild(b);b=a.firstChild.firstChild;a.innerHTML=Tb(Ub);return!b.parentElement});
function Wb(a,b){if(Vb())for(;a.lastChild;)a.removeChild(a.lastChild);a.innerHTML=Tb(b)}
;function Xb(a){return String(a).replace(/\-([a-z])/g,function(b,c){return c.toUpperCase()})}
function Yb(a){return a.replace(RegExp("(^|[\\s]+)([a-z])","g"),function(b,c,d){return c+d.toUpperCase()})}
;function Zb(){return F("iPhone")&&!F("iPod")&&!F("iPad")}
function $b(){return Zb()||F("iPad")||F("iPod")}
;function ac(a){ac[" "](a);return a}
ac[" "]=Ia;function bc(a,b){try{return ac(a[b]),!0}catch(c){}return!1}
function cc(a,b,c,d){d=d?d(b):b;return Object.prototype.hasOwnProperty.call(a,d)?a[d]:a[d]=c(b)}
;var dc=F("Opera"),G=F("Trident")||F("MSIE"),ec=F("Edge"),fc=ec||G,gc=F("Gecko")&&!(-1!=wb.toLowerCase().indexOf("webkit")&&!F("Edge"))&&!(F("Trident")||F("MSIE"))&&!F("Edge"),hc=-1!=wb.toLowerCase().indexOf("webkit")&&!F("Edge"),ic=F("Macintosh"),jc=F("Windows"),kc=F("Android"),lc=Zb(),mc=F("iPad"),nc=F("iPod"),oc=$b();function pc(){var a=x.document;return a?a.documentMode:void 0}
var qc;a:{var rc="",sc=function(){var a=wb;if(gc)return/rv:([^\);]+)(\)|;)/.exec(a);if(ec)return/Edge\/([\d\.]+)/.exec(a);if(G)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(hc)return/WebKit\/(\S+)/.exec(a);if(dc)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
sc&&(rc=sc?sc[1]:"");if(G){var tc=pc();if(null!=tc&&tc>parseFloat(rc)){qc=String(tc);break a}}qc=rc}var uc=qc,vc={};function wc(a){return cc(vc,a,function(){return 0<=ub(uc,a)})}
var xc;if(x.document&&G){var yc=pc();xc=yc?yc:parseInt(uc,10)||void 0}else xc=void 0;var zc=xc;function Ac(a){var b=y("window.location.href");null==a&&(a='Unknown Error of type "null/undefined"');if("string"===typeof a)return{message:a,name:"Unknown error",lineNumber:"Not available",fileName:b,stack:"Not available"};var c=!1;try{var d=a.lineNumber||a.line||"Not available"}catch(g){d="Not available",c=!0}try{var e=a.fileName||a.filename||a.sourceURL||x.$googDebugFname||b}catch(g){e="Not available",c=!0}b=Bc(a);if(!(!c&&a.lineNumber&&a.fileName&&a.stack&&a.message&&a.name)){c=a.message;if(null==
c){if(a.constructor&&a.constructor instanceof Function){if(a.constructor.name)c=a.constructor.name;else if(c=a.constructor,Cc[c])c=Cc[c];else{c=String(c);if(!Cc[c]){var f=/function\s+([^\(]+)/m.exec(c);Cc[c]=f?f[1]:"[Anonymous]"}c=Cc[c]}c='Unknown Error of type "'+c+'"'}else c="Unknown Error of unknown type";"function"===typeof a.toString&&Object.prototype.toString!==a.toString&&(c+=": "+a.toString())}return{message:c,name:a.name||"UnknownError",lineNumber:d,fileName:e,stack:b||"Not available"}}a.stack=
b;return a}
function Bc(a,b){b||(b={});b[Dc(a)]=!0;var c=a.stack||"",d=a.qc;d&&!b[Dc(d)]&&(c+="\nCaused by: ",d.stack&&0==d.stack.indexOf(d.toString())||(c+="string"===typeof d?d:d.message+"\n"),c+=Bc(d,b));return c}
function Dc(a){var b="";"function"===typeof a.toString&&(b=""+a);return b+a.stack}
var Cc={};var Ec=!G||9<=Number(zc),Fc=G&&!wc("9"),Gc=function(){if(!x.addEventListener||!Object.defineProperty)return!1;var a=!1,b=Object.defineProperty({},"passive",{get:function(){a=!0}});
try{x.addEventListener("test",Ia,b),x.removeEventListener("test",Ia,b)}catch(c){}return a}();function Hc(a,b){eb.call(this,a?a.type:"");this.relatedTarget=this.currentTarget=this.target=null;this.button=this.screenY=this.screenX=this.clientY=this.clientX=0;this.key="";this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this.state=null;this.pointerId=0;this.pointerType="";this.g=null;a&&this.init(a,b)}
D(Hc,eb);var Ic={2:"touch",3:"pen",4:"mouse"};
Hc.prototype.init=function(a,b){var c=this.type=a.type,d=a.changedTouches&&a.changedTouches.length?a.changedTouches[0]:null;this.target=a.target||a.srcElement;this.currentTarget=b;var e=a.relatedTarget;e?gc&&(bc(e,"nodeName")||(e=null)):"mouseover"==c?e=a.fromElement:"mouseout"==c&&(e=a.toElement);this.relatedTarget=e;d?(this.clientX=void 0!==d.clientX?d.clientX:d.pageX,this.clientY=void 0!==d.clientY?d.clientY:d.pageY,this.screenX=d.screenX||0,this.screenY=d.screenY||0):(this.clientX=void 0!==a.clientX?
a.clientX:a.pageX,this.clientY=void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a.screenX||0,this.screenY=a.screenY||0);this.button=a.button;this.keyCode=a.keyCode||0;this.key=a.key||"";this.charCode=a.charCode||("keypress"==c?a.keyCode:0);this.ctrlKey=a.ctrlKey;this.altKey=a.altKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.pointerId=a.pointerId||0;this.pointerType="string"===typeof a.pointerType?a.pointerType:Ic[a.pointerType]||"";this.state=a.state;this.g=a;a.defaultPrevented&&this.preventDefault()};
Hc.prototype.stopPropagation=function(){Hc.D.stopPropagation.call(this);this.g.stopPropagation?this.g.stopPropagation():this.g.cancelBubble=!0};
Hc.prototype.preventDefault=function(){Hc.D.preventDefault.call(this);var a=this.g;if(a.preventDefault)a.preventDefault();else if(a.returnValue=!1,Fc)try{if(a.ctrlKey||112<=a.keyCode&&123>=a.keyCode)a.keyCode=-1}catch(b){}};var Jc="closure_listenable_"+(1E6*Math.random()|0),Kc=0;function Lc(a,b,c,d,e){this.listener=a;this.f=null;this.src=b;this.type=c;this.capture=!!d;this.ha=e;this.key=++Kc;this.aa=this.ea=!1}
function Mc(a){a.aa=!0;a.listener=null;a.f=null;a.src=null;a.ha=null}
;function Nc(a){this.src=a;this.listeners={};this.f=0}
Nc.prototype.add=function(a,b,c,d,e){var f=a.toString();a=this.listeners[f];a||(a=this.listeners[f]=[],this.f++);var g=Oc(a,b,d,e);-1<g?(b=a[g],c||(b.ea=!1)):(b=new Lc(b,this.src,f,!!d,e),b.ea=c,a.push(b));return b};
Nc.prototype.remove=function(a,b,c,d){a=a.toString();if(!(a in this.listeners))return!1;var e=this.listeners[a];b=Oc(e,b,c,d);return-1<b?(Mc(e[b]),Array.prototype.splice.call(e,b,1),0==e.length&&(delete this.listeners[a],this.f--),!0):!1};
function Pc(a,b){var c=b.type;c in a.listeners&&mb(a.listeners[c],b)&&(Mc(b),0==a.listeners[c].length&&(delete a.listeners[c],a.f--))}
function Oc(a,b,c,d){for(var e=0;e<a.length;++e){var f=a[e];if(!f.aa&&f.listener==b&&f.capture==!!c&&f.ha==d)return e}return-1}
;var Qc="closure_lm_"+(1E6*Math.random()|0),Rc={},Sc=0;function Tc(a,b,c,d,e){if(d&&d.once)Uc(a,b,c,d,e);else if(Array.isArray(b))for(var f=0;f<b.length;f++)Tc(a,b[f],c,d,e);else c=Vc(c),a&&a[Jc]?a.f.add(String(b),c,!1,Oa(d)?!!d.capture:!!d,e):Wc(a,b,c,!1,d,e)}
function Wc(a,b,c,d,e,f){if(!b)throw Error("Invalid event type");var g=Oa(e)?!!e.capture:!!e,h=Yc(a);h||(a[Qc]=h=new Nc(a));c=h.add(b,c,d,g,f);if(!c.f){d=Zc();c.f=d;d.src=a;d.listener=c;if(a.addEventListener)Gc||(e=g),void 0===e&&(e=!1),a.addEventListener(b.toString(),d,e);else if(a.attachEvent)a.attachEvent($c(b.toString()),d);else if(a.addListener&&a.removeListener)a.addListener(d);else throw Error("addEventListener and attachEvent are unavailable.");Sc++}}
function Zc(){var a=ad,b=Ec?function(c){return a.call(b.src,b.listener,c)}:function(c){c=a.call(b.src,b.listener,c);
if(!c)return c};
return b}
function Uc(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)Uc(a,b[f],c,d,e);else c=Vc(c),a&&a[Jc]?a.f.add(String(b),c,!0,Oa(d)?!!d.capture:!!d,e):Wc(a,b,c,!0,d,e)}
function bd(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)bd(a,b[f],c,d,e);else(d=Oa(d)?!!d.capture:!!d,c=Vc(c),a&&a[Jc])?a.f.remove(String(b),c,d,e):a&&(a=Yc(a))&&(b=a.listeners[b.toString()],a=-1,b&&(a=Oc(b,c,d,e)),(c=-1<a?b[a]:null)&&cd(c))}
function cd(a){if("number"!==typeof a&&a&&!a.aa){var b=a.src;if(b&&b[Jc])Pc(b.f,a);else{var c=a.type,d=a.f;b.removeEventListener?b.removeEventListener(c,d,a.capture):b.detachEvent?b.detachEvent($c(c),d):b.addListener&&b.removeListener&&b.removeListener(d);Sc--;(c=Yc(b))?(Pc(c,a),0==c.f&&(c.src=null,b[Qc]=null)):Mc(a)}}}
function $c(a){return a in Rc?Rc[a]:Rc[a]="on"+a}
function dd(a,b,c,d){var e=!0;if(a=Yc(a))if(b=a.listeners[b.toString()])for(b=b.concat(),a=0;a<b.length;a++){var f=b[a];f&&f.capture==c&&!f.aa&&(f=ed(f,d),e=e&&!1!==f)}return e}
function ed(a,b){var c=a.listener,d=a.ha||a.src;a.ea&&cd(a);return c.call(d,b)}
function ad(a,b){if(a.aa)return!0;if(!Ec){var c=b||y("window.event"),d=new Hc(c,this),e=!0;if(!(0>c.keyCode||void 0!=c.returnValue)){a:{var f=!1;if(0==c.keyCode)try{c.keyCode=-1;break a}catch(k){f=!0}if(f||void 0==c.returnValue)c.returnValue=!0}c=[];for(f=d.currentTarget;f;f=f.parentNode)c.push(f);f=a.type;for(var g=c.length-1;!d.f&&0<=g;g--){d.currentTarget=c[g];var h=dd(c[g],f,!0,d);e=e&&h}for(g=0;!d.f&&g<c.length;g++)d.currentTarget=c[g],h=dd(c[g],f,!1,d),e=e&&h}return e}return ed(a,new Hc(b,this))}
function Yc(a){a=a[Qc];return a instanceof Nc?a:null}
var fd="__closure_events_fn_"+(1E9*Math.random()>>>0);function Vc(a){if(Ma(a))return a;a[fd]||(a[fd]=function(b){return a.handleEvent(b)});
return a[fd]}
;function gd(){cb.call(this);this.f=new Nc(this);this.F=this;this.v=null}
D(gd,cb);gd.prototype[Jc]=!0;gd.prototype.addEventListener=function(a,b,c,d){Tc(this,a,b,c,d)};
gd.prototype.removeEventListener=function(a,b,c,d){bd(this,a,b,c,d)};
gd.prototype.dispatchEvent=function(a){var b=this.v;if(b){var c=[];for(var d=1;b;b=b.v)c.push(b),++d}b=this.F;d=a.type||a;if("string"===typeof a)a=new eb(a,b);else if(a instanceof eb)a.target=a.target||b;else{var e=a;a=new eb(d,b);Gb(a,e)}e=!0;if(c)for(var f=c.length-1;!a.f&&0<=f;f--){var g=a.currentTarget=c[f];e=hd(g,d,!0,a)&&e}a.f||(g=a.currentTarget=b,e=hd(g,d,!0,a)&&e,a.f||(e=hd(g,d,!1,a)&&e));if(c)for(f=0;!a.f&&f<c.length;f++)g=a.currentTarget=c[f],e=hd(g,d,!1,a)&&e;return e};
gd.prototype.S=function(){gd.D.S.call(this);if(this.f){var a=this.f,b=0,c;for(c in a.listeners){for(var d=a.listeners[c],e=0;e<d.length;e++)++b,Mc(d[e]);delete a.listeners[c];a.f--}}this.v=null};
function hd(a,b,c,d){b=a.f.listeners[String(b)];if(!b)return!0;b=b.concat();for(var e=!0,f=0;f<b.length;++f){var g=b[f];if(g&&!g.aa&&g.capture==c){var h=g.listener,k=g.ha||g.src;g.ea&&Pc(a.f,g);e=!1!==h.call(k,d)&&e}}return e&&!d.defaultPrevented}
;function id(a,b){this.i=a;this.j=b;this.g=0;this.f=null}
id.prototype.get=function(){if(0<this.g){this.g--;var a=this.f;this.f=a.next;a.next=null}else a=this.i();return a};
function jd(a,b){a.j(b);100>a.g&&(a.g++,b.next=a.f,a.f=b)}
;var kd=!gc&&!G||G&&9<=Number(zc)||gc&&wc("1.9.1"),ld=G&&!wc("9");function H(a,b){this.x=void 0!==a?a:0;this.y=void 0!==b?b:0}
m=H.prototype;m.clone=function(){return new H(this.x,this.y)};
m.equals=function(a){return a instanceof H&&(this==a?!0:this&&a?this.x==a.x&&this.y==a.y:!1)};
function md(a,b){return new H(a.x-b.x,a.y-b.y)}
m.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};
m.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);return this};
m.round=function(){this.x=Math.round(this.x);this.y=Math.round(this.y);return this};function nd(a,b){this.width=a;this.height=b}
m=nd.prototype;m.clone=function(){return new nd(this.width,this.height)};
m.aspectRatio=function(){return this.width/this.height};
m.isEmpty=function(){return!(this.width*this.height)};
m.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
m.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
m.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};function od(a){return a?new pd(qd(a)):bb||(bb=new pd)}
function I(a){return"string"===typeof a?document.getElementById(a):a}
function rd(a,b){var c=b||document;return c.querySelectorAll&&c.querySelector?c.querySelectorAll("."+a):sd(document,"*",a,b)}
function J(a,b){var c=b||document;if(c.getElementsByClassName)c=c.getElementsByClassName(a)[0];else{c=document;var d=b||c;c=d.querySelectorAll&&d.querySelector&&a?d.querySelector(a?"."+a:""):sd(c,"*",a,b)[0]||null}return c||null}
function sd(a,b,c,d){a=d||a;b=b&&"*"!=b?String(b).toUpperCase():"";if(a.querySelectorAll&&a.querySelector&&(b||c))return a.querySelectorAll(b+(c?"."+c:""));if(c&&a.getElementsByClassName){a=a.getElementsByClassName(c);if(b){d={};for(var e=0,f=0,g;g=a[f];f++)b==g.nodeName&&(d[e++]=g);d.length=e;return d}return a}a=a.getElementsByTagName(b||"*");if(c){d={};for(f=e=0;g=a[f];f++)b=g.className,"function"==typeof b.split&&lb(b.split(/\s+/),c)&&(d[e++]=g);d.length=e;return d}return a}
function td(a,b){zb(b,function(c,d){c&&"object"==typeof c&&c.pa&&(c=c.oa());"style"==d?a.style.cssText=c:"class"==d?a.className=c:"for"==d?a.htmlFor=c:ud.hasOwnProperty(d)?a.setAttribute(ud[d],c):0==d.lastIndexOf("aria-",0)||0==d.lastIndexOf("data-",0)?a.setAttribute(d,c):a[d]=c})}
var ud={cellpadding:"cellPadding",cellspacing:"cellSpacing",colspan:"colSpan",frameborder:"frameBorder",height:"height",maxlength:"maxLength",nonce:"nonce",role:"role",rowspan:"rowSpan",type:"type",usemap:"useMap",valign:"vAlign",width:"width"};function vd(a){a=a.document;a=wd(a)?a.documentElement:a.body;return new nd(a.clientWidth,a.clientHeight)}
function xd(a){var b=yd(a);a=zd(a);return G&&wc("10")&&a.pageYOffset!=b.scrollTop?new H(b.scrollLeft,b.scrollTop):new H(a.pageXOffset||b.scrollLeft,a.pageYOffset||b.scrollTop)}
function yd(a){return a.scrollingElement?a.scrollingElement:!hc&&wd(a)?a.documentElement:a.body||a.documentElement}
function zd(a){return a.parentWindow||a.defaultView}
function Ad(a,b){b=String(b);"application/xhtml+xml"===a.contentType&&(b=b.toLowerCase());return a.createElement(b)}
function wd(a){return"CSS1Compat"==a.compatMode}
function Bd(a){a&&a.parentNode&&a.parentNode.removeChild(a)}
function Cd(a){return kd&&void 0!=a.children?a.children:gb(a.childNodes,function(b){return 1==b.nodeType})}
function Dd(a){return Oa(a)&&1==a.nodeType}
function Ed(a,b){if(!a||!b)return!1;if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if("undefined"!=typeof a.compareDocumentPosition)return a==b||!!(a.compareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}
function qd(a){return 9==a.nodeType?a:a.ownerDocument||a.document}
function Fd(a,b){if("textContent"in a)a.textContent=b;else if(3==a.nodeType)a.data=String(b);else if(a.firstChild&&3==a.firstChild.nodeType){for(;a.lastChild!=a.firstChild;)a.removeChild(a.lastChild);a.firstChild.data=String(b)}else{for(var c;c=a.firstChild;)a.removeChild(c);c=qd(a);a.appendChild(c.createTextNode(String(b)))}}
function Gd(a,b){var c=[];return Hd(a,b,c,!0)?c[0]:void 0}
function Hd(a,b,c,d){if(null!=a)for(a=a.firstChild;a;){if(b(a)&&(c.push(a),d)||Hd(a,b,c,d))return!0;a=a.nextSibling}return!1}
var Id={SCRIPT:1,STYLE:1,HEAD:1,IFRAME:1,OBJECT:1},Jd={IMG:" ",BR:"\n"};function Kd(a){var b;if((b="A"==a.tagName&&a.hasAttribute("href")||"INPUT"==a.tagName||"TEXTAREA"==a.tagName||"SELECT"==a.tagName||"BUTTON"==a.tagName?!a.disabled&&(!Ld(a)||Md(a)):Ld(a)&&Md(a))&&G){var c;!Ma(a.getBoundingClientRect)||G&&null==a.parentElement?c={height:a.offsetHeight,width:a.offsetWidth}:c=a.getBoundingClientRect();a=null!=c&&0<c.height&&0<c.width}else a=b;return a}
function Ld(a){return G&&!wc("9")?(a=a.getAttributeNode("tabindex"),null!=a&&a.specified):a.hasAttribute("tabindex")}
function Md(a){a=a.tabIndex;return"number"===typeof a&&0<=a&&32768>a}
function Nd(a){if(ld&&null!==a&&"innerText"in a)a=a.innerText.replace(/(\r\n|\r|\n)/g,"\n");else{var b=[];Od(a,b,!0);a=b.join("")}a=a.replace(/ \xAD /g," ").replace(/\xAD/g,"");a=a.replace(/\u200B/g,"");ld||(a=a.replace(/ +/g," "));" "!=a&&(a=a.replace(/^\s*/,""));return a}
function Od(a,b,c){if(!(a.nodeName in Id))if(3==a.nodeType)c?b.push(String(a.nodeValue).replace(/(\r\n|\r|\n)/g,"")):b.push(a.nodeValue);else if(a.nodeName in Jd)b.push(Jd[a.nodeName]);else for(a=a.firstChild;a;)Od(a,b,c),a=a.nextSibling}
function Pd(a,b,c,d){if(!b&&!c)return null;var e=b?String(b).toUpperCase():null;return Qd(a,function(f){return(!e||f.nodeName==e)&&(!c||"string"===typeof f.className&&lb(f.className.split(/\s+/),c))},!0,d)}
function K(a,b){return Pd(a,null,b,void 0)}
function Qd(a,b,c,d){a&&!c&&(a=a.parentNode);for(c=0;a&&(null==d||c<=d);){if(b(a))return a;a=a.parentNode;c++}return null}
function pd(a){this.f=a||x.document||document}
pd.prototype.getElementsByTagName=function(a,b){return(b||this.f).getElementsByTagName(String(a))};
pd.prototype.createElement=function(a){return Ad(this.f,a)};
pd.prototype.appendChild=function(a,b){a.appendChild(b)};
pd.prototype.isElement=Dd;function Rd(a){x.setTimeout(function(){throw a;},0)}
var Sd;
function Td(){var a=x.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!F("Presto")&&(a=function(){var e=Ad(document,"IFRAME");e.style.display="none";document.documentElement.appendChild(e);var f=e.contentWindow;e=f.document;e.open();e.close();var g="callImmediate"+Math.random(),h="file:"==f.location.protocol?"*":f.location.protocol+"//"+f.location.host;e=z(function(k){if(("*"==h||k.origin==h)&&k.data==g)this.port1.onmessage()},this);
f.addEventListener("message",e,!1);this.port1={};this.port2={postMessage:function(){f.postMessage(g,h)}}});
if("undefined"!==typeof a&&!F("Trident")&&!F("MSIE")){var b=new a,c={},d=c;b.port1.onmessage=function(){if(void 0!==c.next){c=c.next;var e=c.xa;c.xa=null;e()}};
return function(e){d.next={xa:e};d=d.next;b.port2.postMessage(0)}}return function(e){x.setTimeout(e,0)}}
;function Ud(){this.g=this.f=null}
var Wd=new id(function(){return new Vd},function(a){a.reset()});
Ud.prototype.add=function(a,b){var c=Wd.get();c.set(a,b);this.g?this.g.next=c:this.f=c;this.g=c};
Ud.prototype.remove=function(){var a=null;this.f&&(a=this.f,this.f=this.f.next,this.f||(this.g=null),a.next=null);return a};
function Vd(){this.next=this.scope=this.f=null}
Vd.prototype.set=function(a,b){this.f=a;this.scope=b;this.next=null};
Vd.prototype.reset=function(){this.next=this.scope=this.f=null};function Xd(a,b){Yd||Zd();$d||(Yd(),$d=!0);ae.add(a,b)}
var Yd;function Zd(){if(x.Promise&&x.Promise.resolve){var a=x.Promise.resolve(void 0);Yd=function(){a.then(ce)}}else Yd=function(){var b=ce;
!Ma(x.setImmediate)||x.Window&&x.Window.prototype&&!F("Edge")&&x.Window.prototype.setImmediate==x.setImmediate?(Sd||(Sd=Td()),Sd(b)):x.setImmediate(b)}}
var $d=!1,ae=new Ud;function ce(){for(var a;a=ae.remove();){try{a.f.call(a.scope)}catch(b){Rd(b)}jd(Wd,a)}$d=!1}
;function de(a){this.f=0;this.A=void 0;this.j=this.g=this.i=null;this.o=this.v=!1;if(a!=Ia)try{var b=this;a.call(void 0,function(c){ee(b,2,c)},function(c){ee(b,3,c)})}catch(c){ee(this,3,c)}}
function fe(){this.next=this.context=this.onRejected=this.i=this.f=null;this.g=!1}
fe.prototype.reset=function(){this.context=this.onRejected=this.i=this.f=null;this.g=!1};
var ge=new id(function(){return new fe},function(a){a.reset()});
function he(a,b,c){var d=ge.get();d.i=a;d.onRejected=b;d.context=c;return d}
function ie(a){if(a instanceof de)return a;var b=new de(Ia);ee(b,2,a);return b}
function je(a){return new de(function(b,c){c(a)})}
de.prototype.then=function(a,b,c){return ke(this,Ma(a)?a:null,Ma(b)?b:null,c)};
de.prototype.$goog_Thenable=!0;function le(a,b){var c=he(b,b,void 0);c.g=!0;me(a,c)}
function ne(a,b){return ke(a,null,b,void 0)}
de.prototype.cancel=function(a){if(0==this.f){var b=new oe(a);Xd(function(){pe(this,b)},this)}};
function pe(a,b){if(0==a.f)if(a.i){var c=a.i;if(c.g){for(var d=0,e=null,f=null,g=c.g;g&&(g.g||(d++,g.f==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.f&&1==d?pe(c,b):(f?(d=f,d.next==c.j&&(c.j=d),d.next=d.next.next):qe(c),re(c,e,3,b)))}a.i=null}else ee(a,3,b)}
function me(a,b){a.g||2!=a.f&&3!=a.f||se(a);a.j?a.j.next=b:a.g=b;a.j=b}
function ke(a,b,c,d){var e=he(null,null,null);e.f=new de(function(f,g){e.i=b?function(h){try{var k=b.call(d,h);f(k)}catch(l){g(l)}}:f;
e.onRejected=c?function(h){try{var k=c.call(d,h);void 0===k&&h instanceof oe?g(h):f(k)}catch(l){g(l)}}:g});
e.f.i=a;me(a,e);return e.f}
de.prototype.F=function(a){this.f=0;ee(this,2,a)};
de.prototype.O=function(a){this.f=0;ee(this,3,a)};
function ee(a,b,c){if(0==a.f){a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself"));a.f=1;a:{var d=c,e=a.F,f=a.O;if(d instanceof de){me(d,he(e||Ia,f||null,a));var g=!0}else{if(d)try{var h=!!d.$goog_Thenable}catch(l){h=!1}else h=!1;if(h)d.then(e,f,a),g=!0;else{if(Oa(d))try{var k=d.then;if(Ma(k)){te(d,k,e,f,a);g=!0;break a}}catch(l){f.call(a,l);g=!0;break a}g=!1}}}g||(a.A=c,a.f=b,a.i=null,se(a),3!=b||c instanceof oe||ue(a,c))}}
function te(a,b,c,d,e){function f(k){h||(h=!0,d.call(e,k))}
function g(k){h||(h=!0,c.call(e,k))}
var h=!1;try{b.call(a,g,f)}catch(k){f(k)}}
function se(a){a.v||(a.v=!0,Xd(a.B,a))}
function qe(a){var b=null;a.g&&(b=a.g,a.g=b.next,b.next=null);a.g||(a.j=null);return b}
de.prototype.B=function(){for(var a;a=qe(this);)re(this,a,this.f,this.A);this.v=!1};
function re(a,b,c,d){if(3==c&&b.onRejected&&!b.g)for(;a&&a.o;a=a.i)a.o=!1;if(b.f)b.f.i=null,ve(b,c,d);else try{b.g?b.i.call(b.context):ve(b,c,d)}catch(e){we.call(null,e)}jd(ge,b)}
function ve(a,b,c){2==b?a.i.call(a.context,c):a.onRejected&&a.onRejected.call(a.context,c)}
function ue(a,b){a.o=!0;Xd(function(){a.o&&we.call(null,b)})}
var we=Rd;function oe(a){ab.call(this,a)}
D(oe,ab);oe.prototype.name="cancel";function xe(a,b){gd.call(this);this.j=a||1;this.g=b||x;this.A=z(this.Vb,this);this.B=Va()}
D(xe,gd);m=xe.prototype;m.enabled=!1;m.K=null;m.setInterval=function(a){this.j=a;this.K&&this.enabled?(this.stop(),this.start()):this.K&&this.stop()};
m.Vb=function(){if(this.enabled){var a=Va()-this.B;0<a&&a<.8*this.j?this.K=this.g.setTimeout(this.A,this.j-a):(this.K&&(this.g.clearTimeout(this.K),this.K=null),this.dispatchEvent("tick"),this.enabled&&(this.stop(),this.start()))}};
m.start=function(){this.enabled=!0;this.K||(this.K=this.g.setTimeout(this.A,this.j),this.B=Va())};
m.stop=function(){this.enabled=!1;this.K&&(this.g.clearTimeout(this.K),this.K=null)};
m.S=function(){xe.D.S.call(this);this.stop();delete this.g};function ye(){this.O=new ze;this.i=new Map;this.B=new Set;this.o=0;this.v=100;this.flushInterval=3E4;this.f=new xe(this.flushInterval);this.f.f.add("tick",this.A,!1,!1,this)}
ye.prototype.A=function(){var a=this.i.values();a=[].concat(ha(a)).filter(function(b){return b.Z.size});
a.length&&this.O.flush(a);Ae(a);this.o=0;this.f.enabled&&this.f.stop()};
ye.prototype.g=function(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];this.i.has(a)||this.i.set(a,new $a(a,c))};
ye.prototype.j=function(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];this.F.apply(this,[a,1].concat(ha(c)))};
ye.prototype.F=function(a,b,c){for(var d=[],e=2;e<arguments.length;++e)d[e-2]=arguments[e];(e=this.B.has(a)?void 0:this.i.get(a))&&e instanceof $a&&(e.i(b,d),this.f.enabled||this.f.start(),this.o++,this.o>=this.v&&this.A())};
function Ae(a){for(var b=0;b<a.length;b++)a[b].clear()}
;function Be(){this.f=Ce();this.f.g("/client_streamz/youtube/web/network/one_platform_requests",{U:3,T:"request_url"})}
function De(){this.f=Ce();this.f.g("/client_streamz/youtube/web/network/one_platform_redirects",{U:2,T:"response_code"},{U:3,T:"request_url"},{U:3,T:"response_url"})}
function Ee(a,b,c,d){a.f.j("/client_streamz/youtube/web/network/one_platform_redirects",b,c,d)}
function Fe(){this.f=Ce();this.f.g("/client_streamz/youtube/web/network/one_platform_request_success",{U:3,T:"request_url"})}
function Ge(){this.f=Ce();this.f.g("/client_streamz/youtube/web/network/one_platform_request_failed",{U:2,T:"response_code"},{U:3,T:"request_url"})}
;function He(a,b){var c=void 0;return new (c||(c=Promise))(function(d,e){function f(k){try{h(b.next(k))}catch(l){e(l)}}
function g(k){try{h(b["throw"](k))}catch(l){e(l)}}
function h(k){k.done?d(k.value):(new c(function(l){l(k.value)})).then(f,g)}
h((b=b.apply(a,void 0)).next())})}
;var Ie=0,Je=0;function Ke(a){var b=0>a;a=Math.abs(a);var c=a>>>0;a=Math.floor((a-c)/4294967296);a>>>=0;b&&(a=~a>>>0,c=(~c>>>0)+1,4294967295<c&&(c=0,a++,4294967295<a&&(a=0)));Ie=c;Je=a}
function Le(a){var b=0>a?1:0;a=b?-a:a;if(0===a)Je=0<1/a?0:2147483648,Ie=0;else if(isNaN(a))Je=2147483647,Ie=4294967295;else if(1.7976931348623157E308<a)Je=(b<<31|2146435072)>>>0,Ie=0;else if(2.2250738585072014E-308>a)a/=Math.pow(2,-1074),Je=(b<<31|a/4294967296)>>>0,Ie=a>>>0;else{var c=a,d=0;if(2<=c)for(;2<=c&&1023>d;)d++,c/=2;else for(;1>c&&-1022<d;)c*=2,d--;a*=Math.pow(2,-d);Je=(b<<31|d+1023<<20|1048576*a&1048575)>>>0;Ie=4503599627370496*a>>>0}}
;function Me(){this.f=[]}
Me.prototype.length=function(){return this.f.length};
Me.prototype.end=function(){var a=this.f;this.f=[];return a};
function Ne(a){for(var b=Ie,c=Je;0<c||127<b;)a.f.push(b&127|128),b=(b>>>7|c<<25)>>>0,c>>>=7;a.f.push(b)}
function Oe(a,b){for(;127<b;)a.f.push(b&127|128),b>>>=7;a.f.push(b)}
function Pe(a,b){if(0<=b)Oe(a,b);else{for(var c=0;9>c;c++)a.f.push(b&127|128),b>>=7;a.f.push(1)}}
function Qe(a,b){a.f.push(b>>>0&255);a.f.push(b>>>8&255);a.f.push(b>>>16&255);a.f.push(b>>>24&255)}
;var Re=Hb(),Se=Zb()||F("iPod"),Te=F("iPad"),Ue=Kb(),Ve=Jb(),We=Ib()&&!$b();var Xe={},Ye=null;
function Ze(a,b){La(a);void 0===b&&(b=0);if(!Ye){Ye={};for(var c="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split(""),d=["+/=","+/","-_=","-_.","-_"],e=0;5>e;e++){var f=c.concat(d[e].split(""));Xe[e]=f;for(var g=0;g<f.length;g++){var h=f[g];void 0===Ye[h]&&(Ye[h]=g)}}}c=Xe[b];d=[];for(e=0;e<a.length;e+=3){var k=a[e],l=(f=e+1<a.length)?a[e+1]:0,n=(g=e+2<a.length)?a[e+2]:0;h=k>>2;k=(k&3)<<4|l>>4;l=(l&15)<<2|n>>6;n&=63;g||(n=64,f||(l=64));d.push(c[h],c[k],c[l]||"",c[n]||"")}return d.join("")}
;function $e(){this.i=[];this.g=0;this.f=new Me}
function af(a,b){bf(a,b,2);var c=a.f.end();a.i.push(c);a.g+=c.length;c.push(a.g);return c}
function cf(a,b){var c=b.pop();for(c=a.g+a.f.length()-c;127<c;)b.push(c&127|128),c>>>=7,a.g++;b.push(c);a.g++}
$e.prototype.reset=function(){this.i=[];this.f.end();this.g=0};
function bf(a,b,c){Oe(a.f,8*b+c)}
function df(a,b,c){null!=c&&(bf(a,b,1),a=a.f,b=c>>>0,c=Math.floor((c-b)/4294967296)>>>0,Ie=b,Je=c,Qe(a,Ie),Qe(a,Je))}
function ef(a,b,c){null!=c&&(bf(a,b,0),a.f.f.push(c?1:0))}
function ff(a,b,c){if(null!=c){b=af(a,b);for(var d=a.f,e=0;e<c.length;e++){var f=c.charCodeAt(e);if(128>f)d.f.push(f);else if(2048>f)d.f.push(f>>6|192),d.f.push(f&63|128);else if(65536>f)if(55296<=f&&56319>=f&&e+1<c.length){var g=c.charCodeAt(e+1);56320<=g&&57343>=g&&(f=1024*(f-55296)+g-56320+65536,d.f.push(f>>18|240),d.f.push(f>>12&63|128),d.f.push(f>>6&63|128),d.f.push(f&63|128),e++)}else d.f.push(f>>12|224),d.f.push(f>>6&63|128),d.f.push(f&63|128)}cf(a,b)}}
function gf(a,b,c,d){null!=c&&(b=af(a,b),d(c,a),cf(a,b))}
function hf(a,b,c,d){if(null!=c)for(var e=0;e<c.length;e++){var f=af(a,b);d(c[e],a);cf(a,f)}}
;function jf(){}
var kf="function"==typeof Uint8Array;function lf(a,b,c,d){a.f=null;b||(b=[]);a.A=void 0;a.j=-1;a.g=b;a:{if(b=a.g.length){--b;var e=a.g[b];if(!(null===e||"object"!=typeof e||Array.isArray(e)||kf&&e instanceof Uint8Array)){a.o=b-a.j;a.i=e;break a}}a.o=Number.MAX_VALUE}a.v={};if(c)for(b=0;b<c.length;b++)e=c[b],e<a.o?(e+=a.j,a.g[e]=a.g[e]||mf):(nf(a),a.i[e]=a.i[e]||mf);if(d&&d.length)for(b=0;b<d.length;b++)of(a,d[b])}
var mf=[];function nf(a){var b=a.o+a.j;a.g[b]||(a.i=a.g[b]={})}
function L(a,b){if(b<a.o){var c=b+a.j,d=a.g[c];return d===mf?a.g[c]=[]:d}if(a.i)return d=a.i[b],d===mf?a.i[b]=[]:d}
function pf(a,b,c){b<a.o?a.g[b+a.j]=c:(nf(a),a.i[b]=c);return a}
function qf(a,b,c,d){(c=of(a,c))&&c!==b&&void 0!==d&&(a.f&&c in a.f&&(a.f[c]=void 0),pf(a,c,void 0));pf(a,b,d)}
function of(a,b){for(var c,d,e=0;e<b.length;e++){var f=b[e],g=L(a,f);null!=g&&(c=f,d=g,pf(a,f,void 0))}return c?(pf(a,c,d),c):0}
function rf(a,b,c){a.f||(a.f={});if(!a.f[c]){var d=L(a,c);d&&(a.f[c]=new b(d))}return a.f[c]}
function sf(a,b,c){a.f||(a.f={});if(!a.f[c]){for(var d=L(a,c),e=[],f=0;f<d.length;f++)e[f]=new b(d[f]);a.f[c]=e}b=a.f[c];b==mf&&(b=a.f[c]=[]);return b}
function tf(a,b,c){a.f||(a.f={});c=c||[];for(var d=[],e=0;e<c.length;e++)d[e]=uf(c[e]);a.f[b]=c;pf(a,b,d)}
function vf(a){if(a.f)for(var b in a.f){var c=a.f[b];if(Array.isArray(c))for(var d=0;d<c.length;d++)c[d]&&uf(c[d]);else c&&uf(c)}}
function uf(a){vf(a);return a.g}
jf.prototype.toString=function(){vf(this);return this.g.toString()};
jf.prototype.clone=function(){return new this.constructor(wf(uf(this)))};
function wf(a){if(Array.isArray(a)){for(var b=Array(a.length),c=0;c<a.length;c++){var d=a[c];null!=d&&(b[c]="object"==typeof d?wf(d):d)}return b}if(kf&&a instanceof Uint8Array)return new Uint8Array(a);b={};for(c in a)d=a[c],null!=d&&(b[c]="object"==typeof d?wf(d):d);return b}
;var xf=window;function yf(a){this.f=a||{cookie:""}}
m=yf.prototype;m.isEnabled=function(){return navigator.cookieEnabled};
m.set=function(a,b,c){var d=!1;if("object"===typeof c){var e=c.Cc;d=c.secure||!1;var f=c.domain||void 0;var g=c.path||void 0;var h=c.Ma}if(/[;=\s]/.test(a))throw Error('Invalid cookie name "'+a+'"');if(/[;\r\n]/.test(b))throw Error('Invalid cookie value "'+b+'"');void 0===h&&(h=-1);c=f?";domain="+f:"";g=g?";path="+g:"";d=d?";secure":"";h=0>h?"":0==h?";expires="+(new Date(1970,1,1)).toUTCString():";expires="+(new Date(Va()+1E3*h)).toUTCString();this.f.cookie=a+"="+b+c+g+h+d+(null!=e?";samesite="+e:
"")};
m.get=function(a,b){for(var c=a+"=",d=(this.f.cookie||"").split(";"),e=0,f;e<d.length;e++){f=tb(d[e]);if(0==f.lastIndexOf(c,0))return f.substr(c.length);if(f==a)return""}return b};
m.remove=function(a,b,c){var d=void 0!==this.get(a);this.set(a,"",{Ma:0,path:b,domain:c});return d};
m.isEmpty=function(){return!this.f.cookie};
m.clear=function(){for(var a=(this.f.cookie||"").split(";"),b=[],c=[],d,e,f=0;f<a.length;f++)e=tb(a[f]),d=e.indexOf("="),-1==d?(b.push(""),c.push(e)):(b.push(e.substring(0,d)),c.push(e.substring(d+1)));for(a=b.length-1;0<=a;a--)this.remove(b[a])};
var zf=new yf("undefined"==typeof document?null:document);var Af=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^\\/?#]*)@)?([^\\/?#]*?)(?::([0-9]+))?(?=[\\/?#]|$))?([^?#]+)?(?:\?([^#]*))?(?:#([\s\S]*))?$/;function Bf(a){return a?decodeURI(a):a}
function Cf(a,b){return b.match(Af)[a]||null}
function Df(a){return Bf(Cf(3,a))}
function Ef(a,b){if(!b)return a;var c=a.indexOf("#");0>c&&(c=a.length);var d=a.indexOf("?");if(0>d||d>c){d=c;var e=""}else e=a.substring(d+1,c);c=[a.substr(0,d),e,a.substr(c)];d=c[1];c[1]=b?d?d+"&"+b:b:d;return c[0]+(c[1]?"?"+c[1]:"")+c[2]}
function Ff(a,b,c){if(Array.isArray(b))for(var d=0;d<b.length;d++)Ff(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function Gf(a,b){for(var c=[],d=b||0;d<a.length;d+=2)Ff(a[d],a[d+1],c);return c.join("&")}
function Hf(a){var b=[],c;for(c in a)Ff(c,a[c],b);return b.join("&")}
function If(a,b){var c=2==arguments.length?Gf(arguments[1],0):Gf(arguments,1);return Ef(a,c)}
function Jf(a,b){var c=Hf(b);return Ef(a,c)}
function Kf(a,b,c){for(;0<=(b=a.indexOf("key",b))&&b<c;){var d=a.charCodeAt(b-1);if(38==d||63==d)if(d=a.charCodeAt(b+3),!d||61==d||38==d||35==d)return b;b+=4}return-1}
var Lf=/#|$/,Mf=/[?&]($|#)/;function Nf(a){for(var b=a.search(Lf),c=0,d,e=[];0<=(d=Kf(a,c,b));)e.push(a.substring(c,d)),c=Math.min(a.indexOf("&",d)+1||b,b);e.push(a.substr(c));return e.join("").replace(Mf,"$1")}
;function Of(a){var b=Pf;if(b)for(var c in b)Object.prototype.hasOwnProperty.call(b,c)&&a.call(void 0,b[c],c,b)}
function Qf(){var a=[];Of(function(b){a.push(b)});
return a}
var Pf={Zb:"allow-forms",ac:"allow-modals",cc:"allow-orientation-lock",dc:"allow-pointer-lock",ec:"allow-popups",fc:"allow-popups-to-escape-sandbox",hc:"allow-presentation",ic:"allow-same-origin",jc:"allow-scripts",kc:"allow-top-navigation",lc:"allow-top-navigation-by-user-activation"},Rf=Lb(function(){return Qf()});
function Sf(){var a=Ad(document,"IFRAME"),b={};E(Rf(),function(c){a.sandbox&&a.sandbox.supports&&a.sandbox.supports(c)&&(b[c]=!0)});
return b}
;function Tf(a,b,c,d){this.top=a;this.right=b;this.bottom=c;this.left=d}
m=Tf.prototype;m.getHeight=function(){return this.bottom-this.top};
m.clone=function(){return new Tf(this.top,this.right,this.bottom,this.left)};
m.ceil=function(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);return this};
m.floor=function(){this.top=Math.floor(this.top);this.right=Math.floor(this.right);this.bottom=Math.floor(this.bottom);this.left=Math.floor(this.left);return this};
m.round=function(){this.top=Math.round(this.top);this.right=Math.round(this.right);this.bottom=Math.round(this.bottom);this.left=Math.round(this.left);return this};function Uf(a,b,c,d){this.left=a;this.top=b;this.width=c;this.height=d}
Uf.prototype.clone=function(){return new Uf(this.left,this.top,this.width,this.height)};
Uf.prototype.ceil=function(){this.left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
Uf.prototype.floor=function(){this.left=Math.floor(this.left);this.top=Math.floor(this.top);this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
Uf.prototype.round=function(){this.left=Math.round(this.left);this.top=Math.round(this.top);this.width=Math.round(this.width);this.height=Math.round(this.height);return this};var Vf={};function Wf(){}
function Xf(a,b){if(b!==Vf)throw Error("Bad secret");this.f=a}
qa(Xf,Wf);Xf.prototype.toString=function(){return this.f};new Xf("about:blank",Vf);new Xf("about:invalid#zTSz",Vf);function Yf(a,b,c){if("string"===typeof b)(b=Zf(a,b))&&(a.style[b]=c);else for(var d in b){c=a;var e=b[d],f=Zf(c,d);f&&(c.style[f]=e)}}
var $f={};function Zf(a,b){var c=$f[b];if(!c){var d=Xb(b);c=d;void 0===a.style[d]&&(d=(hc?"Webkit":gc?"Moz":G?"ms":dc?"O":null)+Yb(d),void 0!==a.style[d]&&(c=d));$f[b]=c}return c}
function ag(a,b){var c=qd(a);return c.defaultView&&c.defaultView.getComputedStyle&&(c=c.defaultView.getComputedStyle(a,null))?c[b]||c.getPropertyValue(b)||"":""}
function bg(a,b){return ag(a,b)||(a.currentStyle?a.currentStyle[b]:null)||a.style&&a.style[b]}
function cg(a){try{return a.getBoundingClientRect()}catch(b){return{left:0,top:0,right:0,bottom:0}}}
function dg(a){if(G&&!(8<=Number(zc)))return a.offsetParent;var b=qd(a),c=bg(a,"position"),d="fixed"==c||"absolute"==c;for(a=a.parentNode;a&&a!=b;a=a.parentNode)if(11==a.nodeType&&a.host&&(a=a.host),c=bg(a,"position"),d=d&&"static"==c&&a!=b.documentElement&&a!=b.body,!d&&(a.scrollWidth>a.clientWidth||a.scrollHeight>a.clientHeight||"fixed"==c||"absolute"==c||"relative"==c))return a;return null}
function eg(a){for(var b=new Tf(0,Infinity,Infinity,0),c=od(a),d=c.f.body,e=c.f.documentElement,f=yd(c.f);a=dg(a);)if(!(G&&0==a.clientWidth||hc&&0==a.clientHeight&&a==d)&&a!=d&&a!=e&&"visible"!=bg(a,"overflow")){var g=fg(a),h=new H(a.clientLeft,a.clientTop);g.x+=h.x;g.y+=h.y;b.top=Math.max(b.top,g.y);b.right=Math.min(b.right,g.x+a.clientWidth);b.bottom=Math.min(b.bottom,g.y+a.clientHeight);b.left=Math.max(b.left,g.x)}d=f.scrollLeft;f=f.scrollTop;b.left=Math.max(b.left,d);b.top=Math.max(b.top,f);c=
vd(zd(c.f)||window);b.right=Math.min(b.right,d+c.width);b.bottom=Math.min(b.bottom,f+c.height);return 0<=b.top&&0<=b.left&&b.bottom>b.top&&b.right>b.left?b:null}
function fg(a){var b=qd(a),c=new H(0,0);var d=b?qd(b):document;d=!G||9<=Number(zc)||wd(od(d).f)?d.documentElement:d.body;if(a==d)return c;a=cg(a);b=xd(od(b).f);c.x=a.left+b.x;c.y=a.top+b.y;return c}
function gg(a){a=cg(a);return new H(a.left,a.top)}
function hg(a,b,c){if(b instanceof nd)c=b.height,b=b.width;else if(void 0==c)throw Error("missing height argument");a.style.width=ig(b,!0);a.style.height=ig(c,!0)}
function ig(a,b){"number"==typeof a&&(a=(b?Math.round(a):a)+"px");return a}
function jg(a){var b=kg;if("none"!=bg(a,"display"))return b(a);var c=a.style,d=c.display,e=c.visibility,f=c.position;c.visibility="hidden";c.position="absolute";c.display="inline";a=b(a);c.display=d;c.position=f;c.visibility=e;return a}
function kg(a){var b=a.offsetWidth,c=a.offsetHeight,d=hc&&!b&&!c;return(void 0===b||d)&&a.getBoundingClientRect?(a=cg(a),new nd(a.right-a.left,a.bottom-a.top)):new nd(b,c)}
function lg(a){var b=fg(a);a=jg(a);return new Uf(b.x,b.y,a.width,a.height)}
function mg(a){return"rtl"==bg(a,"direction")}
function ng(a,b){if(/^\d+px?$/.test(b))return parseInt(b,10);var c=a.style.left,d=a.runtimeStyle.left;a.runtimeStyle.left=a.currentStyle.left;a.style.left=b;var e=a.style.pixelLeft;a.style.left=c;a.runtimeStyle.left=d;return+e}
function og(a,b){var c=a.currentStyle?a.currentStyle[b]:null;return c?ng(a,c):0}
var pg={thin:2,medium:4,thick:6};function qg(a,b){if("none"==(a.currentStyle?a.currentStyle[b+"Style"]:null))return 0;var c=a.currentStyle?a.currentStyle[b+"Width"]:null;return c in pg?pg[c]:ng(a,c)}
;var rg=(new Date).getTime();function sg(a){if(!a)return"";a=a.split("#")[0].split("?")[0];a=a.toLowerCase();0==a.indexOf("//")&&(a=window.location.protocol+a);/^[\w\-]*:\/\//.test(a)||(a=window.location.href);var b=a.substring(a.indexOf("://")+3),c=b.indexOf("/");-1!=c&&(b=b.substring(0,c));a=a.substring(0,a.indexOf("://"));if("http"!==a&&"https"!==a&&"chrome-extension"!==a&&"moz-extension"!==a&&"file"!==a&&"android-app"!==a&&"chrome-search"!==a&&"chrome-untrusted"!==a&&"chrome"!==a&&"app"!==a&&"devtools"!==a)throw Error("Invalid URI scheme in origin: "+
a);c="";var d=b.indexOf(":");if(-1!=d){var e=b.substring(d+1);b=b.substring(0,d);if("http"===a&&"80"!==e||"https"===a&&"443"!==e)c=":"+e}return a+"://"+b+c}
;/*
 gapi.loader.OBJECT_CREATE_TEST_OVERRIDE &&*/
var tg=window,ug=document,vg=tg.location;function wg(){}
var xg=/\[native code\]/;function M(a,b,c){return a[b]=a[b]||c}
function yg(a){a=a.sort();for(var b=[],c=void 0,d=0;d<a.length;d++){var e=a[d];e!=c&&b.push(e);c=e}return b}
function zg(){var a;if((a=Object.create)&&xg.test(a))a=a(null);else{a={};for(var b in a)a[b]=void 0}return a}
var Ag=M(tg,"gapi",{});var N;N=M(tg,"___jsl",zg());M(N,"I",0);M(N,"hel",10);function Bg(){var a=vg.href;if(N.dpo)var b=N.h;else{b=N.h;var c=RegExp("([#].*&|[#])jsh=([^&#]*)","g"),d=RegExp("([?#].*&|[?#])jsh=([^&#]*)","g");if(a=a&&(c.exec(a)||d.exec(a)))try{b=decodeURIComponent(a[2])}catch(e){}}return b}
function Cg(a){var b=M(N,"PQ",[]);N.PQ=[];var c=b.length;if(0===c)a();else for(var d=0,e=function(){++d===c&&a()},f=0;f<c;f++)b[f](e)}
function Dg(a){return M(M(N,"H",zg()),a,zg())}
;function Eg(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;e[4]=3285377520;n=l=0}
function b(p){for(var q=g,r=0;64>r;r+=4)q[r/4]=p[r]<<24|p[r+1]<<16|p[r+2]<<8|p[r+3];for(r=16;80>r;r++)p=q[r-3]^q[r-8]^q[r-14]^q[r-16],q[r]=(p<<1|p>>>31)&4294967295;p=e[0];var u=e[1],B=e[2],C=e[3],Rb=e[4];for(r=0;80>r;r++){if(40>r)if(20>r){var na=C^u&(B^C);var Na=1518500249}else na=u^B^C,Na=1859775393;else 60>r?(na=u&B|C&(u|B),Na=2400959708):(na=u^B^C,Na=3395469782);na=((p<<5|p>>>27)&4294967295)+na+Rb+Na+q[r]&4294967295;Rb=C;C=B;B=(u<<30|u>>>2)&4294967295;u=p;p=na}e[0]=e[0]+p&4294967295;e[1]=e[1]+
u&4294967295;e[2]=e[2]+B&4294967295;e[3]=e[3]+C&4294967295;e[4]=e[4]+Rb&4294967295}
function c(p,q){if("string"===typeof p){p=unescape(encodeURIComponent(p));for(var r=[],u=0,B=p.length;u<B;++u)r.push(p.charCodeAt(u));p=r}q||(q=p.length);r=0;if(0==l)for(;r+64<q;)b(p.slice(r,r+64)),r+=64,n+=64;for(;r<q;)if(f[l++]=p[r++],n++,64==l)for(l=0,b(f);r+64<q;)b(p.slice(r,r+64)),r+=64,n+=64}
function d(){var p=[],q=8*n;56>l?c(h,56-l):c(h,64-(l-56));for(var r=63;56<=r;r--)f[r]=q&255,q>>>=8;b(f);for(r=q=0;5>r;r++)for(var u=24;0<=u;u-=8)p[q++]=e[r]>>u&255;return p}
for(var e=[],f=[],g=[],h=[128],k=1;64>k;++k)h[k]=0;var l,n;a();return{reset:a,update:c,digest:d,pb:function(){for(var p=d(),q="",r=0;r<p.length;r++)q+="0123456789ABCDEF".charAt(Math.floor(p[r]/16))+"0123456789ABCDEF".charAt(p[r]%16);return q}}}
;function Fg(a,b,c){var d=[],e=[];if(1==(Array.isArray(c)?2:1))return e=[b,a],E(d,function(h){e.push(h)}),Gg(e.join(" "));
var f=[],g=[];E(c,function(h){g.push(h.key);f.push(h.value)});
c=Math.floor((new Date).getTime()/1E3);e=0==f.length?[c,b,a]:[f.join(":"),c,b,a];E(d,function(h){e.push(h)});
a=Gg(e.join(" "));a=[c,a];0==g.length||a.push(g.join(""));return a.join("_")}
function Gg(a){var b=Eg();b.update(a);return b.pb().toLowerCase()}
;function Hg(a){var b=sg(String(x.location.href)),c;(c=x.__SAPISID||x.__APISID||x.__OVERRIDE_SID)?c=!0:(c=new yf(document),c=c.get("SAPISID")||c.get("APISID")||c.get("__Secure-3PAPISID")||c.get("SID"),c=!!c);if(c&&(c=(b=0==b.indexOf("https:")||0==b.indexOf("chrome-extension:")||0==b.indexOf("moz-extension:"))?x.__SAPISID:x.__APISID,c||(c=new yf(document),c=c.get(b?"SAPISID":"APISID")||c.get("__Secure-3PAPISID")),c)){b=b?"SAPISIDHASH":"APISIDHASH";var d=String(x.location.href);return d&&c&&b?[b,Fg(sg(d),
c,a||null)].join(" "):null}return null}
;var Ig=M(N,"perf",zg());M(Ig,"g",zg());var Jg=M(Ig,"i",zg());M(Ig,"r",[]);zg();zg();function Kg(a,b,c){b&&0<b.length&&(b=Lg(b),c&&0<c.length&&(b+="___"+Lg(c)),28<b.length&&(b=b.substr(0,28)+(b.length-28)),c=b,b=M(Jg,"_p",zg()),M(b,c,zg())[a]=(new Date).getTime(),b=Ig.r,"function"===typeof b?b(a,"_p",c):b.push([a,"_p",c]))}
function Lg(a){return a.join("__").replace(/\./g,"_").replace(/\-/g,"_").replace(/,/g,"_")}
;var Mg=zg(),Ng=[];function Og(a){throw Error("Bad hint"+(a?": "+a:""));}
Ng.push(["jsl",function(a){for(var b in a)if(Object.prototype.hasOwnProperty.call(a,b)){var c=a[b];"object"==typeof c?N[b]=M(N,b,[]).concat(c):M(N,b,c)}if(b=a.u)a=M(N,"us",[]),a.push(b),(b=/^https:(.*)$/.exec(b))&&a.push("http:"+b[1])}]);
var Pg=/^(\/[a-zA-Z0-9_\-]+)+$/,Qg=[/\/amp\//,/\/amp$/,/^\/amp$/],Rg=/^[a-zA-Z0-9\-_\.,!]+$/,Sg=/^gapi\.loaded_[0-9]+$/,Tg=/^[a-zA-Z0-9,._-]+$/;function Ug(a,b,c,d){var e=a.split(";"),f=e.shift(),g=Mg[f],h=null;g?h=g(e,b,c,d):Og("no hint processor for: "+f);h||Og("failed to generate load url");b=h;c=b.match(Vg);(d=b.match(Wg))&&1===d.length&&Xg.test(b)&&c&&1===c.length||Og("failed sanity: "+a);return h}
function Yg(a,b,c,d){function e(f){return encodeURIComponent(f).replace(/%2C/g,",")}
a=Zg(a);Sg.test(c)||Og("invalid_callback");b=$g(b);d=d&&d.length?$g(d):null;return[encodeURIComponent(a.pathPrefix).replace(/%2C/g,",").replace(/%2F/g,"/"),"/k=",e(a.version),"/m=",e(b),d?"/exm="+e(d):"","/rt=j/sv=1/d=1/ed=1",a.va?"/am="+e(a.va):"",a.Za?"/rs="+e(a.Za):"",a.jb?"/t="+e(a.jb):"","/cb=",e(c)].join("")}
function Zg(a){"/"!==a.charAt(0)&&Og("relative path");for(var b=a.substring(1).split("/"),c=[];b.length;){a=b.shift();if(!a.length||0==a.indexOf("."))Og("empty/relative directory");else if(0<a.indexOf("=")){b.unshift(a);break}c.push(a)}a={};for(var d=0,e=b.length;d<e;++d){var f=b[d].split("="),g=decodeURIComponent(f[0]),h=decodeURIComponent(f[1]);2==f.length&&g&&h&&(a[g]=a[g]||h)}b="/"+c.join("/");Pg.test(b)||Og("invalid_prefix");c=0;for(d=Qg.length;c<d;++c)Qg[c].test(b)&&Og("invalid_prefix");c=ah(a,
"k",!0);d=ah(a,"am");e=ah(a,"rs");a=ah(a,"t");return{pathPrefix:b,version:c,va:d,Za:e,jb:a}}
function $g(a){for(var b=[],c=0,d=a.length;c<d;++c){var e=a[c].replace(/\./g,"_").replace(/-/g,"_");Tg.test(e)&&b.push(e)}return b.join(",")}
function ah(a,b,c){a=a[b];!a&&c&&Og("missing: "+b);if(a){if(Rg.test(a))return a;Og("invalid: "+b)}return null}
var Xg=/^https?:\/\/[a-z0-9_.-]+\.google(rs)?\.com(:\d+)?\/[a-zA-Z0-9_.,!=\-\/]+$/,Wg=/\/cb=/g,Vg=/\/\//g;function bh(){var a=Bg();if(!a)throw Error("Bad hint");return a}
Mg.m=function(a,b,c,d){(a=a[0])||Og("missing_hint");return"https://apis.google.com"+Yg(a,b,c,d)};
var ch=decodeURI("%73cript"),dh=/^[-+_0-9\/A-Za-z]+={0,2}$/;function eh(a,b){for(var c=[],d=0;d<a.length;++d){var e=a[d],f;if(f=e){a:{for(f=0;f<b.length;f++)if(b[f]===e)break a;f=-1}f=0>f}f&&c.push(e)}return c}
function fh(){var a=N.nonce;return void 0!==a?a&&a===String(a)&&a.match(dh)?a:N.nonce=null:ug.querySelector?(a=ug.querySelector("script[nonce]"))?(a=a.nonce||a.getAttribute("nonce")||"",a&&a===String(a)&&a.match(dh)?N.nonce=a:N.nonce=null):null:null}
function gh(a){if("loading"!=ug.readyState)hh(a);else{var b=fh(),c="";null!==b&&(c=' nonce="'+b+'"');a="<"+ch+' src="'+encodeURI(a)+'"'+c+"></"+ch+">";ug.write(ih?ih.createHTML(a):a)}}
function hh(a){var b=ug.createElement(ch);b.setAttribute("src",ih?ih.createScriptURL(a):a);a=fh();null!==a&&b.setAttribute("nonce",a);b.async="true";(a=ug.getElementsByTagName(ch)[0])?a.parentNode.insertBefore(b,a):(ug.head||ug.body||ug.documentElement).appendChild(b)}
function jh(a,b){var c=b&&b._c;if(c)for(var d=0;d<Ng.length;d++){var e=Ng[d][0],f=Ng[d][1];f&&Object.prototype.hasOwnProperty.call(c,e)&&f(c[e],a,b)}}
function kh(a,b,c){lh(function(){var d=b===Bg()?M(Ag,"_",zg()):zg();d=M(Dg(b),"_",d);a(d)},c)}
function mh(a,b){var c=b||{};"function"==typeof b&&(c={},c.callback=b);jh(a,c);var d=a?a.split(":"):[],e=c.h||bh(),f=M(N,"ah",zg());if(f["::"]&&d.length){for(var g=[],h=null;h=d.shift();){var k=h.split(".");k=f[h]||f[k[1]&&"ns:"+k[0]||""]||e;var l=g.length&&g[g.length-1]||null,n=l;l&&l.hint==k||(n={hint:k,features:[]},g.push(n));n.features.push(h)}var p=g.length;if(1<p){var q=c.callback;q&&(c.callback=function(){0==--p&&q()})}for(;d=g.shift();)nh(d.features,c,d.hint)}else nh(d||[],c,e)}
function nh(a,b,c){function d(na,Na){if(p)return 0;tg.clearTimeout(n);q.push.apply(q,u);var Xc=((Ag||{}).config||{}).update;Xc?Xc(f):f&&M(N,"cu",[]).push(f);if(Na){Kg("me0",na,r);try{kh(Na,c,l)}finally{Kg("me1",na,r)}}return 1}
a=yg(a)||[];var e=b.callback,f=b.config,g=b.timeout,h=b.ontimeout,k=b.onerror,l=void 0;"function"==typeof k&&(l=k);var n=null,p=!1;if(g&&!h||!g&&h)throw"Timeout requires both the timeout parameter and ontimeout parameter to be set";k=M(Dg(c),"r",[]).sort();var q=M(Dg(c),"L",[]).sort(),r=[].concat(k);0<g&&(n=tg.setTimeout(function(){p=!0;h()},g));
var u=eh(a,q);if(u.length){u=eh(a,k);var B=M(N,"CP",[]),C=B.length;B[C]=function(na){function Na(){var be=B[C+1];be&&be()}
function Xc(be){B[C]=null;d(u,na)&&Cg(function(){e&&e();be()})}
if(!na)return 0;Kg("ml1",u,r);0<C&&B[C-1]?B[C]=function(){Xc(Na)}:Xc(Na)};
if(u.length){var Rb="loaded_"+N.I++;Ag[Rb]=function(na){B[C](na);Ag[Rb]=null};
a=Ug(c,u,"gapi."+Rb,k);k.push.apply(k,u);Kg("ml0",u,r);b.sync||tg.___gapisync?gh(a):hh(a)}else B[C](wg)}else d(u)&&e&&e()}
var ih=Xa("goog#gapi");function lh(a,b){if(N.hee&&0<N.hel)try{return a()}catch(c){b&&b(c),N.hel--,mh("debug_error",function(){try{window.___jsl.hefn(c)}catch(d){throw c;}})}else try{return a()}catch(c){throw b&&b(c),c;
}}
Ag.load=function(a,b){return lh(function(){return mh(a,b)})};function oh(){this.g=-1}
;function ph(){this.g=64;this.f=[];this.v=[];this.A=[];this.j=[];this.j[0]=128;for(var a=1;a<this.g;++a)this.j[a]=0;this.o=this.i=0;this.reset()}
D(ph,oh);ph.prototype.reset=function(){this.f[0]=1732584193;this.f[1]=4023233417;this.f[2]=2562383102;this.f[3]=271733878;this.f[4]=3285377520;this.o=this.i=0};
function qh(a,b,c){c||(c=0);var d=a.A;if("string"===typeof b)for(var e=0;16>e;e++)d[e]=b.charCodeAt(c)<<24|b.charCodeAt(c+1)<<16|b.charCodeAt(c+2)<<8|b.charCodeAt(c+3),c+=4;else for(e=0;16>e;e++)d[e]=b[c]<<24|b[c+1]<<16|b[c+2]<<8|b[c+3],c+=4;for(e=16;80>e;e++){var f=d[e-3]^d[e-8]^d[e-14]^d[e-16];d[e]=(f<<1|f>>>31)&4294967295}b=a.f[0];c=a.f[1];var g=a.f[2],h=a.f[3],k=a.f[4];for(e=0;80>e;e++){if(40>e)if(20>e){f=h^c&(g^h);var l=1518500249}else f=c^g^h,l=1859775393;else 60>e?(f=c&g|h&(c|g),l=2400959708):
(f=c^g^h,l=3395469782);f=(b<<5|b>>>27)+f+k+l+d[e]&4294967295;k=h;h=g;g=(c<<30|c>>>2)&4294967295;c=b;b=f}a.f[0]=a.f[0]+b&4294967295;a.f[1]=a.f[1]+c&4294967295;a.f[2]=a.f[2]+g&4294967295;a.f[3]=a.f[3]+h&4294967295;a.f[4]=a.f[4]+k&4294967295}
ph.prototype.update=function(a,b){if(null!=a){void 0===b&&(b=a.length);for(var c=b-this.g,d=0,e=this.v,f=this.i;d<b;){if(0==f)for(;d<=c;)qh(this,a,d),d+=this.g;if("string"===typeof a)for(;d<b;){if(e[f]=a.charCodeAt(d),++f,++d,f==this.g){qh(this,e);f=0;break}}else for(;d<b;)if(e[f]=a[d],++f,++d,f==this.g){qh(this,e);f=0;break}}this.i=f;this.o+=b}};
ph.prototype.digest=function(){var a=[],b=8*this.o;56>this.i?this.update(this.j,56-this.i):this.update(this.j,this.g-(this.i-56));for(var c=this.g-1;56<=c;c--)this.v[c]=b&255,b/=256;qh(this,this.v);for(c=b=0;5>c;c++)for(var d=24;0<=d;d-=8)a[b]=this.f[c]>>d&255,++b;return a};function rh(a){lf(this,a,sh,null)}
D(rh,jf);function th(a){lf(this,a,null,null)}
D(th,jf);var sh=[1];function uh(a,b){var c=sf(a,th,1);0<c.length&&hf(b,1,c,vh)}
function vh(a,b){var c=L(a,1);if(null!=c&&null!=c){bf(b,1,1);var d=b.f;Le(c);Qe(d,Ie);Qe(d,Je)}c=L(a,2);null!=c&&null!=c&&null!=c&&(bf(b,2,0),d=b.f,Ke(c),Ne(d))}
;function wh(a){lf(this,a,xh,null)}
D(wh,jf);function yh(a){lf(this,a,null,zh)}
D(yh,jf);function Ah(a){lf(this,a,null,null)}
D(Ah,jf);function Bh(a){lf(this,a,null,null)}
D(Bh,jf);function Ch(a){lf(this,a,Dh,null)}
D(Ch,jf);function Eh(a){lf(this,a,null,Fh)}
D(Eh,jf);function Gh(a){lf(this,a,null,Hh)}
D(Gh,jf);var xh=[3,6,4],zh=[[1,2]];function Ih(a,b){var c=rf(a,Ah,1);null!=c&&gf(b,1,c,Jh);c=rf(a,Bh,2);null!=c&&gf(b,2,c,Kh)}
function Jh(a,b){var c=L(a,1);null!=c&&ff(b,1,c);c=L(a,2);null!=c&&ff(b,2,c);c=L(a,3);null!=c&&ef(b,3,c)}
function Kh(a,b){var c=L(a,1);null!=c&&ff(b,1,c);c=L(a,2);null!=c&&ff(b,2,c);c=L(a,3);null!=c&&null!=c&&null!=c&&(bf(b,3,0),Pe(b.f,c));c=L(a,4);null!=c&&ef(b,4,c)}
var Dh=[1];function Lh(a,b){var c=sf(a,Eh,1);0<c.length&&hf(b,1,c,Mh);c=rf(a,Gh,2);null!=c&&gf(b,2,c,Nh)}
var Fh=[[1,2,3]];function Mh(a,b){var c=L(a,1);null!=c&&ff(b,1,c);c=L(a,2);null!=c&&null!=c&&null!=c&&(bf(b,2,0),Pe(b.f,c));c=L(a,3);null!=c&&ef(b,3,c)}
var Hh=[[1,2,3]];function Nh(a,b){var c=L(a,1);if(null!=c&&null!=c&&null!=c){bf(b,1,0);var d=b.f;Ke(c);Ne(d)}c=L(a,2);null!=c&&null!=c&&(bf(b,2,1),d=b.f,Le(c),Qe(d,Ie),Qe(d,Je));c=rf(a,rh,3);null!=c&&gf(b,3,c,uh)}
;function Oh(){this.g=[];this.f=-1}
Oh.prototype.set=function(a,b){b=void 0===b?!0:b;0<=a&&52>a&&0===a%1&&this.g[a]!=b&&(this.g[a]=b,this.f=-1)};
Oh.prototype.get=function(a){return!!this.g[a]};
function Ph(a){-1==a.f&&(a.f=ib(a.g,function(b,c,d){return c?b+Math.pow(2,d):b},0));
return a.f}
;var Qh="StopIteration"in x?x.StopIteration:{message:"StopIteration",stack:""};function Rh(){}
Rh.prototype.next=function(){throw Qh;};
Rh.prototype.P=function(){return this};
function Sh(a){if(a instanceof Rh)return a;if("function"==typeof a.P)return a.P(!1);if(La(a)){var b=0,c=new Rh;c.next=function(){for(;;){if(b>=a.length)throw Qh;if(b in a)return a[b++];b++}};
return c}throw Error("Not implemented");}
function Th(a,b){if(La(a))try{E(a,b,void 0)}catch(c){if(c!==Qh)throw c;}else{a=Sh(a);try{for(;;)b.call(void 0,a.next(),void 0,a)}catch(c){if(c!==Qh)throw c;}}}
function Uh(a){if(La(a))return ob(a);a=Sh(a);var b=[];Th(a,function(c){b.push(c)});
return b}
;function Vh(a,b){this.i={};this.f=[];this.R=this.g=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof Vh)for(c=Wh(a),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])}
function Wh(a){Xh(a);return a.f.concat()}
m=Vh.prototype;m.equals=function(a,b){if(this===a)return!0;if(this.g!=a.g)return!1;var c=b||Yh;Xh(this);for(var d,e=0;d=this.f[e];e++)if(!c(this.get(d),a.get(d)))return!1;return!0};
function Yh(a,b){return a===b}
m.isEmpty=function(){return 0==this.g};
m.clear=function(){this.i={};this.R=this.g=this.f.length=0};
m.remove=function(a){return Object.prototype.hasOwnProperty.call(this.i,a)?(delete this.i[a],this.g--,this.R++,this.f.length>2*this.g&&Xh(this),!0):!1};
function Xh(a){if(a.g!=a.f.length){for(var b=0,c=0;b<a.f.length;){var d=a.f[b];Object.prototype.hasOwnProperty.call(a.i,d)&&(a.f[c++]=d);b++}a.f.length=c}if(a.g!=a.f.length){var e={};for(c=b=0;b<a.f.length;)d=a.f[b],Object.prototype.hasOwnProperty.call(e,d)||(a.f[c++]=d,e[d]=1),b++;a.f.length=c}}
m.get=function(a,b){return Object.prototype.hasOwnProperty.call(this.i,a)?this.i[a]:b};
m.set=function(a,b){Object.prototype.hasOwnProperty.call(this.i,a)||(this.g++,this.f.push(a),this.R++);this.i[a]=b};
m.forEach=function(a,b){for(var c=Wh(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};
m.clone=function(){return new Vh(this)};
m.P=function(a){Xh(this);var b=0,c=this.R,d=this,e=new Rh;e.next=function(){if(c!=d.R)throw Error("The map has changed since the iterator was created");if(b>=d.f.length)throw Qh;var f=d.f[b++];return a?f:d.i[f]};
return e};function Zh(a){return"string"==typeof a.className?a.className:a.getAttribute&&a.getAttribute("class")||""}
function $h(a){return a.classList?a.classList:Zh(a).match(/\S+/g)||[]}
function ai(a,b){"string"==typeof a.className?a.className=b:a.setAttribute&&a.setAttribute("class",b)}
function O(a,b){return a.classList?a.classList.contains(b):lb($h(a),b)}
function P(a,b){if(a.classList)a.classList.add(b);else if(!O(a,b)){var c=Zh(a);ai(a,c+(0<c.length?" "+b:b))}}
function bi(a,b){if(a.classList)E(b,function(f){P(a,f)});
else{var c={};E($h(a),function(f){c[f]=!0});
E(b,function(f){c[f]=!0});
var d="",e;for(e in c)d+=0<d.length?" "+e:e;ai(a,d)}}
function ci(a,b){a.classList?a.classList.remove(b):O(a,b)&&ai(a,gb($h(a),function(c){return c!=b}).join(" "))}
function di(a,b){a.classList?E(b,function(c){ci(a,c)}):ai(a,gb($h(a),function(c){return!lb(b,c)}).join(" "))}
function ei(a,b,c){c?P(a,b):ci(a,b)}
function fi(a,b,c){O(a,b)&&(ci(a,b),P(a,c))}
function gi(a,b){var c=!O(a,b);ei(a,b,c)}
;var hi=!G&&!Ib();function ii(a,b){if(/-[a-z]/.test(b))return null;if(hi&&a.dataset){if(Kb()&&!(b in a.dataset))return null;var c=a.dataset[b];return void 0===c?null:c}return a.getAttribute("data-"+String(b).replace(/([A-Z])/g,"-$1").toLowerCase())}
;function ji(a){var b=[];ki(new li,a,b);return b.join("")}
function li(){}
function ki(a,b,c){if(null==b)c.push("null");else{if("object"==typeof b){if(Array.isArray(b)){var d=b;b=d.length;c.push("[");for(var e="",f=0;f<b;f++)c.push(e),ki(a,d[f],c),e=",";c.push("]");return}if(b instanceof String||b instanceof Number||b instanceof Boolean)b=b.valueOf();else{c.push("{");e="";for(d in b)Object.prototype.hasOwnProperty.call(b,d)&&(f=b[d],"function"!=typeof f&&(c.push(e),mi(d,c),c.push(":"),ki(a,f,c),e=","));c.push("}");return}}switch(typeof b){case "string":mi(b,c);break;case "number":c.push(isFinite(b)&&
!isNaN(b)?String(b):"null");break;case "boolean":c.push(String(b));break;case "function":c.push("null");break;default:throw Error("Unknown type: "+typeof b);}}}
var ni={'"':'\\"',"\\":"\\\\","/":"\\/","\b":"\\b","\f":"\\f","\n":"\\n","\r":"\\r","\t":"\\t","\x0B":"\\u000b"},oi=/\uffff/.test("\uffff")?/[\\"\x00-\x1f\x7f-\uffff]/g:/[\\"\x00-\x1f\x7f-\xff]/g;function mi(a,b){b.push('"',a.replace(oi,function(c){var d=ni[c];d||(d="\\u"+(c.charCodeAt(0)|65536).toString(16).substr(1),ni[c]=d);return d}),'"')}
;var pi=new WeakMap;function qi(a,b){for(var c=[a],d=b.length-1;0<=d;--d)c.push(typeof b[d],b[d]);return c.join("\x0B")}
;var ri=function(){if(jc){var a=/Windows NT ([0-9.]+)/;return(a=a.exec(wb))?a[1]:"0"}return ic?(a=/10[_.][0-9_.]+/,(a=a.exec(wb))?a[0].replace(/_/g,"."):"10"):kc?(a=/Android\s+([^\);]+)(\)|;)/,(a=a.exec(wb))?a[1]:""):lc||mc||nc?(a=/(?:iPhone|CPU)\s+OS\s+(\S+)/,(a=a.exec(wb))?a[1].replace(/_/g,"."):""):""}();function si(a){return(a=a.exec(wb))?a[1]:""}
var ti=function(){if(Re)return si(/Firefox\/([0-9.]+)/);if(G||ec||dc)return uc;if(Ve)return $b()?si(/CriOS\/([0-9.]+)/):si(/Chrome\/([0-9.]+)/);if(We&&!$b())return si(/Version\/([0-9.]+)/);if(Se||Te){var a=/Version\/(\S+).*Mobile\/(\S+)/.exec(wb);if(a)return a[1]+"."+a[2]}else if(Ue)return(a=si(/Android\s+([0-9.]+)/))?a:si(/Version\/([0-9.]+)/);return""}();function ui(a,b,c,d,e,f,g){var h;if(h=c.offsetParent){var k="HTML"==h.tagName||"BODY"==h.tagName;if(!k||"static"!=bg(h,"position")){var l=fg(h);if(!k){k=mg(h);var n;if(n=k){if(n=We)n=0<=ub(ti,10);var p;if(p=oc)p=0<=ub(ri,10);n=gc||n||p}k=n?-h.scrollLeft:!k||fc&&wc("8")||"visible"==bg(h,"overflowX")?h.scrollLeft:h.scrollWidth-h.clientWidth-h.scrollLeft;l=md(l,new H(k,h.scrollTop))}}}h=l||new H;l=lg(a);if(k=eg(a)){var q=new Uf(k.left,k.top,k.right-k.left,k.bottom-k.top);k=Math.max(l.left,q.left);n=
Math.min(l.left+l.width,q.left+q.width);k<=n&&(p=Math.max(l.top,q.top),q=Math.min(l.top+l.height,q.top+q.height),p<=q&&(l.left=k,l.top=p,l.width=n-k,l.height=q-p))}k=od(a);p=od(c);if(k.f!=p.f){n=k.f.body;p=zd(p.f);q=new H(0,0);var r=(r=qd(n))?zd(r):window;if(bc(r,"parent")){var u=n;do{var B=r==p?fg(u):gg(u);q.x+=B.x;q.y+=B.y}while(r&&r!=p&&r!=r.parent&&(u=r.frameElement)&&(r=r.parent))}n=md(q,fg(n));!G||9<=Number(zc)||wd(k.f)||(n=md(n,xd(k.f)));l.left+=n.x;l.top+=n.y}a=vi(a,b);b=l.left;a&4?b+=l.width:
a&2&&(b+=l.width/2);b=new H(b,l.top+(a&1?l.height:0));b=md(b,h);e&&(b.x+=(a&4?-1:1)*e.x,b.y+=(a&1?-1:1)*e.y);var C;g&&(C=eg(c))&&(C.top-=h.y,C.right-=h.x,C.bottom-=h.y,C.left-=h.x);return wi(b,c,d,f,C,g,void 0)}
function wi(a,b,c,d,e,f,g){a=a.clone();var h=vi(b,c);c=jg(b);g=g?g.clone():c.clone();a=a.clone();g=g.clone();var k=0;if(d||0!=h)h&4?a.x-=g.width+(d?d.right:0):h&2?a.x-=g.width/2:d&&(a.x+=d.left),h&1?a.y-=g.height+(d?d.bottom:0):d&&(a.y+=d.top);if(f){if(e){d=a;h=g;k=0;65==(f&65)&&(d.x<e.left||d.x>=e.right)&&(f&=-2);132==(f&132)&&(d.y<e.top||d.y>=e.bottom)&&(f&=-5);d.x<e.left&&f&1&&(d.x=e.left,k|=1);if(f&16){var l=d.x;d.x<e.left&&(d.x=e.left,k|=4);d.x+h.width>e.right&&(h.width=Math.min(e.right-d.x,
l+h.width-e.left),h.width=Math.max(h.width,0),k|=4)}d.x+h.width>e.right&&f&1&&(d.x=Math.max(e.right-h.width,e.left),k|=1);f&2&&(k|=(d.x<e.left?16:0)|(d.x+h.width>e.right?32:0));d.y<e.top&&f&4&&(d.y=e.top,k|=2);f&32&&(l=d.y,d.y<e.top&&(d.y=e.top,k|=8),d.y+h.height>e.bottom&&(h.height=Math.min(e.bottom-d.y,l+h.height-e.top),h.height=Math.max(h.height,0),k|=8));d.y+h.height>e.bottom&&f&4&&(d.y=Math.max(e.bottom-h.height,e.top),k|=2);f&8&&(k|=(d.y<e.top?64:0)|(d.y+h.height>e.bottom?128:0));e=k}else e=
256;k=e}f=new Uf(0,0,0,0);f.left=a.x;f.top=a.y;f.width=g.width;f.height=g.height;e=k;if(e&496)return e;a=new H(f.left,f.top);a instanceof H?(g=a.x,a=a.y):(g=a,a=void 0);b.style.left=ig(g,!1);b.style.top=ig(a,!1);g=new nd(f.width,f.height);c==g||c&&g&&c.width==g.width&&c.height==g.height||(c=g,g=qd(b),a=wd(od(g).f),!G||wc("10")||a&&wc("8")?(b=b.style,gc?b.MozBoxSizing="border-box":hc?b.WebkitBoxSizing="border-box":b.boxSizing="border-box",b.width=Math.max(c.width,0)+"px",b.height=Math.max(c.height,
0)+"px"):(g=b.style,a?(G?(a=og(b,"paddingLeft"),f=og(b,"paddingRight"),d=og(b,"paddingTop"),h=og(b,"paddingBottom"),a=new Tf(d,f,h,a)):(a=ag(b,"paddingLeft"),f=ag(b,"paddingRight"),d=ag(b,"paddingTop"),h=ag(b,"paddingBottom"),a=new Tf(parseFloat(d),parseFloat(f),parseFloat(h),parseFloat(a))),!G||9<=Number(zc)?(f=ag(b,"borderLeftWidth"),d=ag(b,"borderRightWidth"),h=ag(b,"borderTopWidth"),b=ag(b,"borderBottomWidth"),b=new Tf(parseFloat(h),parseFloat(d),parseFloat(b),parseFloat(f))):(f=qg(b,"borderLeft"),
d=qg(b,"borderRight"),h=qg(b,"borderTop"),b=qg(b,"borderBottom"),b=new Tf(h,d,b,f)),g.pixelWidth=c.width-b.left-a.left-a.right-b.right,g.pixelHeight=c.height-b.top-a.top-a.bottom-b.bottom):(g.pixelWidth=c.width,g.pixelHeight=c.height)));return e}
function vi(a,b){return(b&8&&mg(a)?b^4:b)&-9}
;function Q(a){cb.call(this);this.A=1;this.j=[];this.v=0;this.f=[];this.g={};this.B=!!a}
D(Q,cb);m=Q.prototype;m.subscribe=function(a,b,c){var d=this.g[a];d||(d=this.g[a]=[]);var e=this.A;this.f[e]=a;this.f[e+1]=b;this.f[e+2]=c;this.A=e+3;d.push(e);return e};
function xi(a,b){var c=!1,d=a.subscribe("ROOT_MENU_REMOVED",function(e){c||(c=!0,this.ba(d),b.apply(void 0,arguments))},a)}
function yi(a,b,c){if(b=a.g[b]){var d=a.f;(b=kb(b,function(e){return d[e+1]==c&&void 0==d[e+2]}))&&a.ba(b)}}
m.ba=function(a){var b=this.f[a];if(b){var c=this.g[b];0!=this.v?(this.j.push(a),this.f[a+1]=Ia):(c&&mb(c,a),delete this.f[a],delete this.f[a+1],delete this.f[a+2])}return!!b};
m.M=function(a,b){var c=this.g[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.B)for(e=0;e<c.length;e++){var g=c[e];zi(this.f[g+1],this.f[g+2],d)}else{this.v++;try{for(e=0,f=c.length;e<f;e++)g=c[e],this.f[g+1].apply(this.f[g+2],d)}finally{if(this.v--,0<this.j.length&&0==this.v)for(;c=this.j.pop();)this.ba(c)}}return 0!=e}return!1};
function zi(a,b,c){Xd(function(){a.apply(b,c)})}
m.clear=function(a){if(a){var b=this.g[a];b&&(E(b,this.ba,this),delete this.g[a])}else this.f.length=0,this.g={}};
function Ai(a,b){if(b){var c=a.g[b];return c?c.length:0}c=0;for(var d in a.g)c+=Ai(a,d);return c}
m.S=function(){Q.D.S.call(this);this.clear();this.j.length=0};function Bi(a){this.f=a}
Bi.prototype.set=function(a,b){void 0===b?this.f.remove(a):this.f.set(a,ji(b))};
Bi.prototype.get=function(a){try{var b=this.f.get(a)}catch(c){return}if(null!==b)try{return JSON.parse(b)}catch(c){throw"Storage: Invalid value was encountered";}};
Bi.prototype.remove=function(a){this.f.remove(a)};function Ci(a){this.f=a}
D(Ci,Bi);function Di(a){this.data=a}
function Ei(a){return void 0===a||a instanceof Di?a:new Di(a)}
Ci.prototype.set=function(a,b){Ci.D.set.call(this,a,Ei(b))};
Ci.prototype.g=function(a){a=Ci.D.get.call(this,a);if(void 0===a||a instanceof Object)return a;throw"Storage: Invalid value was encountered";};
Ci.prototype.get=function(a){if(a=this.g(a)){if(a=a.data,void 0===a)throw"Storage: Invalid value was encountered";}else a=void 0;return a};function Fi(a){this.f=a}
D(Fi,Ci);Fi.prototype.set=function(a,b,c){if(b=Ei(b)){if(c){if(c<Va()){Fi.prototype.remove.call(this,a);return}b.expiration=c}b.creation=Va()}Fi.D.set.call(this,a,b)};
Fi.prototype.g=function(a){var b=Fi.D.g.call(this,a);if(b){var c=b.creation,d=b.expiration;if(d&&d<Va()||c&&c>Va())Fi.prototype.remove.call(this,a);else return b}};function Gi(){}
;function Hi(){}
D(Hi,Gi);Hi.prototype.clear=function(){var a=Uh(this.P(!0)),b=this;E(a,function(c){b.remove(c)})};function Ii(a){this.f=a}
D(Ii,Hi);m=Ii.prototype;m.isAvailable=function(){if(!this.f)return!1;try{return this.f.setItem("__sak","1"),this.f.removeItem("__sak"),!0}catch(a){return!1}};
m.set=function(a,b){try{this.f.setItem(a,b)}catch(c){if(0==this.f.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
m.get=function(a){a=this.f.getItem(a);if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
m.remove=function(a){this.f.removeItem(a)};
m.P=function(a){var b=0,c=this.f,d=new Rh;d.next=function(){if(b>=c.length)throw Qh;var e=c.key(b++);if(a)return e;e=c.getItem(e);if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return e};
return d};
m.clear=function(){this.f.clear()};
m.key=function(a){return this.f.key(a)};function Ji(){var a=null;try{a=window.localStorage||null}catch(b){}this.f=a}
D(Ji,Ii);function Ki(a,b){this.g=a;this.f=null;if(G&&!(9<=Number(zc))){Li||(Li=new Vh);this.f=Li.get(a);this.f||(b?this.f=document.getElementById(b):(this.f=document.createElement("userdata"),this.f.addBehavior("#default#userData"),document.body.appendChild(this.f)),Li.set(a,this.f));try{this.f.load(this.g)}catch(c){this.f=null}}}
D(Ki,Hi);var Mi={".":".2E","!":".21","~":".7E","*":".2A","'":".27","(":".28",")":".29","%":"."},Li=null;function Ni(a){return"_"+encodeURIComponent(a).replace(/[.!~*'()%]/g,function(b){return Mi[b]})}
m=Ki.prototype;m.isAvailable=function(){return!!this.f};
m.set=function(a,b){this.f.setAttribute(Ni(a),b);Oi(this)};
m.get=function(a){a=this.f.getAttribute(Ni(a));if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
m.remove=function(a){this.f.removeAttribute(Ni(a));Oi(this)};
m.P=function(a){var b=0,c=this.f.XMLDocument.documentElement.attributes,d=new Rh;d.next=function(){if(b>=c.length)throw Qh;var e=c[b++];if(a)return decodeURIComponent(e.nodeName.replace(/\./g,"%")).substr(1);e=e.nodeValue;if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return e};
return d};
m.clear=function(){for(var a=this.f.XMLDocument.documentElement,b=a.attributes.length;0<b;b--)a.removeAttribute(a.attributes[b-1].nodeName);Oi(this)};
function Oi(a){try{a.f.save(a.g)}catch(b){throw"Storage mechanism: Quota exceeded";}}
;function Pi(a,b){this.g=a;this.f=b+"::"}
D(Pi,Hi);Pi.prototype.set=function(a,b){this.g.set(this.f+a,b)};
Pi.prototype.get=function(a){return this.g.get(this.f+a)};
Pi.prototype.remove=function(a){this.g.remove(this.f+a)};
Pi.prototype.P=function(a){var b=this.g.P(!0),c=this,d=new Rh;d.next=function(){for(var e=b.next();e.substr(0,c.f.length)!=c.f;)e=b.next();return a?e.substr(c.f.length):c.g.get(e)};
return d};var Qi=window.yt&&window.yt.config_||window.ytcfg&&window.ytcfg.data_||{};A("yt.config_",Qi);function Ri(a){var b=arguments,c=Qi;1<b.length?c[b[0]]=b[1]:1===b.length&&Object.assign(c,b[0])}
function R(a,b){return a in Qi?Qi[a]:b}
;var Si=[];function Ti(a){Si.forEach(function(b){return b(a)})}
function Ui(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){Vi(b),Ti(b)}}:a}
function Vi(a){var b=y("yt.logging.errors.log");b?b(a,"ERROR",void 0,void 0,void 0):(b=R("ERRORS",[]),b.push([a,"ERROR",void 0,void 0,void 0]),Ri("ERRORS",b))}
function Wi(a){var b=y("yt.logging.errors.log");b?b(a,"WARNING",void 0,void 0,void 0):(b=R("ERRORS",[]),b.push([a,"WARNING",void 0,void 0,void 0]),Ri("ERRORS",b))}
;function Xi(a,b){"function"===typeof a&&(a=Ui(a));return window.setTimeout(a,b)}
function Yi(a){window.clearTimeout(a)}
;var Zi=x.ytPubsubPubsubInstance||new Q,$i=x.ytPubsubPubsubSubscribedKeys||{},aj=x.ytPubsubPubsubTopicToKeys||{},bj=x.ytPubsubPubsubIsSynchronous||{};function cj(a,b,c){var d=dj();if(d){var e=d.subscribe(a,function(){var f=arguments;var g=function(){$i[e]&&b.apply&&"function"==typeof b.apply&&b.apply(c||window,f)};
try{bj[a]?g():Xi(g,0)}catch(h){Vi(h)}},c);
$i[e]=!0;aj[a]||(aj[a]=[]);aj[a].push(e);return e}return 0}
function ej(a){var b=dj();b&&("number"===typeof a?a=[a]:"string"===typeof a&&(a=[parseInt(a,10)]),E(a,function(c){b.unsubscribeByKey(c);delete $i[c]}))}
function fj(a,b){var c=dj();return c?c.publish.apply(c,arguments):!1}
function gj(a,b){bj[a]=!0;var c=dj();c&&c.publish.apply(c,arguments);bj[a]=!1}
function dj(){return x.ytPubsubPubsubInstance}
Q.prototype.subscribe=Q.prototype.subscribe;Q.prototype.unsubscribeByKey=Q.prototype.ba;Q.prototype.publish=Q.prototype.M;Q.prototype.clear=Q.prototype.clear;A("ytPubsubPubsubInstance",Zi);A("ytPubsubPubsubTopicToKeys",aj);A("ytPubsubPubsubIsSynchronous",bj);A("ytPubsubPubsubSubscribedKeys",$i);function hj(a,b,c){a&&(a.dataset?a.dataset[ij(b)]=String(c):a.setAttribute("data-"+b,c))}
function jj(a,b){return a?a.dataset?a.dataset[ij(b)]:a.getAttribute("data-"+b):null}
function kj(a,b){a&&(a.dataset?delete a.dataset[ij(b)]:a.removeAttribute("data-"+b))}
var lj={};function ij(a){return lj[a]||(lj[a]=String(a).replace(/\-([a-z])/g,function(b,c){return c.toUpperCase()}))}
;function S(a,b){this.version=a;this.args=b}
;function T(a,b){this.topic=a;this.f=b}
T.prototype.toString=function(){return this.topic};function mj(){}
function nj(a,b){return oj(a,0,b)}
function pj(a,b){return oj(a,1,b)}
;function qj(){}
qa(qj,mj);function oj(a,b,c){isNaN(c)&&(c=void 0);var d=y("yt.scheduler.instance.addJob");return d?d(a,b,c):void 0===c?(a(),NaN):Xi(a,c||0)}
qj.prototype.start=function(){var a=y("yt.scheduler.instance.start");a&&a()};
Ja(qj);qj.C();var rj=y("ytPubsub2Pubsub2Instance")||new Q;Q.prototype.subscribe=Q.prototype.subscribe;Q.prototype.unsubscribeByKey=Q.prototype.ba;Q.prototype.publish=Q.prototype.M;Q.prototype.clear=Q.prototype.clear;A("ytPubsub2Pubsub2Instance",rj);var sj=y("ytPubsub2Pubsub2SubscribedKeys")||{};A("ytPubsub2Pubsub2SubscribedKeys",sj);var tj=y("ytPubsub2Pubsub2TopicToKeys")||{};A("ytPubsub2Pubsub2TopicToKeys",tj);var uj=y("ytPubsub2Pubsub2IsAsync")||{};A("ytPubsub2Pubsub2IsAsync",uj);
A("ytPubsub2Pubsub2SkipSubKey",null);function U(a,b){var c=vj();c&&c.publish.call(c,a.toString(),a,b)}
function wj(a,b,c){var d=vj();if(!d)return 0;var e=d.subscribe(a.toString(),function(f,g){var h=y("ytPubsub2Pubsub2SkipSubKey");h&&h==e||(h=function(){if(sj[e])try{if(g&&a instanceof T&&a!=f)try{var k=a.f,l=g;if(!l.args||!l.version)throw Error("yt.pubsub2.Data.deserialize(): serializedData is incomplete.");try{if(!k.R){var n=new k;k.R=n.version}var p=k.R}catch(q){}if(!p||l.version!=p)throw Error("yt.pubsub2.Data.deserialize(): serializedData version is incompatible.");try{g=Reflect.construct(k,ob(l.args))}catch(q){throw q.message=
"yt.pubsub2.Data.deserialize(): "+q.message,q;}}catch(q){throw q.message="yt.pubsub2.pubsub2 cross-binary conversion error for "+a.toString()+": "+q.message,q;}b.call(c||window,g)}catch(q){Vi(q)}},uj[a.toString()]?y("yt.scheduler.instance")?pj(h):Xi(h,0):h())});
sj[e]=!0;tj[a.toString()]||(tj[a.toString()]=[]);tj[a.toString()].push(e);return e}
function xj(a){var b=vj();b&&("number"===typeof a&&(a=[a]),E(a,function(c){b.unsubscribeByKey(c);delete sj[c]}))}
function vj(){return y("ytPubsub2Pubsub2Instance")}
;var yj=0;function zj(a){var b=a.__yt_uid_key;b||(b=Aj(),a.__yt_uid_key=b);return b}
function Bj(a,b){a=I(a);b=I(b);return!!Qd(a,function(c){return c===b},!0,void 0)}
function Cj(a,b){var c=sd(document,a,null,b);return c.length?c[0]:null}
function Dj(){var a=document,b;jb(["fullscreenElement","webkitFullscreenElement","mozFullScreenElement","msFullscreenElement"],function(c){b=a[c];return!!b});
return b}
function Ej(){ei(document.body,"hide-players",!1);var a=rd("preserve-players");E(a,function(b){ci(b,"preserve-players")})}
var Aj=y("ytDomDomGetNextId")||function(){return++yj};
A("ytDomDomGetNextId",Aj);var Fj={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function Gj(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.ctrlKey=this.altKey=!1;this.clientY=this.clientX=0;this.changedTouches=this.touches=null;try{if(a=a||window.event){this.event=a;for(var b in a)b in Fj||(this[b]=a[b]);var c=a.target||a.srcElement;c&&3==c.nodeType&&(c=c.parentNode);this.target=c;var d=a.relatedTarget;if(d)try{d=d.nodeName?d:null}catch(e){d=null}else"mouseover"==
this.type?d=a.fromElement:"mouseout"==this.type&&(d=a.toElement);this.relatedTarget=d;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey}}catch(e){}}
Gj.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
Gj.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
Gj.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var Cb=x.ytEventsEventsListeners||{};A("ytEventsEventsListeners",Cb);var Hj=x.ytEventsEventsCounter||{count:0};A("ytEventsEventsCounter",Hj);
function Ij(a,b,c,d){d=void 0===d?{}:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return Bb(function(e){var f="boolean"===typeof e[4]&&e[4]==!!d,g=Oa(e[4])&&Oa(d)&&Db(e[4],d);return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&(f||g)})}
function V(a,b,c,d){d=void 0===d?{}:d;if(!a||!a.addEventListener&&!a.attachEvent)return"";var e=Ij(a,b,c,d);if(e)return e;e=++Hj.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(h){h=new Gj(h);if(!Qd(h.relatedTarget,function(k){return k==a},!0))return h.currentTarget=a,h.type=b,c.call(a,h)}:function(h){h=new Gj(h);
h.currentTarget=a;return c.call(a,h)};
g=Ui(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),Jj()||"boolean"===typeof d?a.addEventListener(b,g,d):a.addEventListener(b,g,!!d.capture)):a.attachEvent("on"+b,g);Cb[e]=[a,b,c,g,d];return e}
function Kj(a,b,c){var d=a||document;return V(d,"click",function(e){var f=Qd(e.target,function(g){return g===d||c(g)},!0);
f&&f!==d&&!f.disabled&&(e.currentTarget=f,b.call(f,e))})}
function Lj(a){a=a||window.event;a=a.target||a.srcElement;3==a.nodeType&&(a=a.parentNode);return a}
var Jj=Lb(function(){var a=!1;try{var b=Object.defineProperty({},"capture",{get:function(){a=!0}});
window.addEventListener("test",null,b)}catch(c){}return a});
function Mj(a,b,c){return Kj(a,b,function(d){return O(d,c)})}
function Nj(a){if(document.createEvent){var b=document.createEvent("HTMLEvents");b.initEvent("click",!0,!0);a.dispatchEvent(b)}else b=document.createEventObject(),a.fireEvent("onclick",b)}
function Oj(a){a&&("string"==typeof a&&(a=[a]),E(a,function(b){if(b in Cb){var c=Cb[b],d=c[0],e=c[1],f=c[3];c=c[4];d.removeEventListener?Jj()||"boolean"===typeof c?d.removeEventListener(e,f,c):d.removeEventListener(e,f,!!c.capture):d.detachEvent&&d.detachEvent("on"+e,f);delete Cb[b]}}))}
;var Pj={},Qj="ontouchstart"in document;function Rj(a,b,c){switch(a){case "mouseover":case "mouseout":var d=3;break;case "mouseenter":case "mouseleave":d=9}return Qd(c,function(e){return O(e,b)},!0,d)}
function Sj(a){var b="mouseover"==a.type&&"mouseenter"in Pj||"mouseout"==a.type&&"mouseleave"in Pj,c=a.type in Pj||b;if("HTML"!=a.target.tagName&&c){if(b){b="mouseover"==a.type?"mouseenter":"mouseleave";c=Pj[b];for(var d in c.g){var e=Rj(b,d,a.target);e&&!Qd(a.relatedTarget,function(f){return f==e},!0)&&c.M(d,e,b,a)}}if(b=Pj[a.type])for(d in b.g)(e=Rj(a.type,d,a.target))&&b.M(d,e,a.type,a)}}
V(document,"blur",Sj,!0);V(document,"change",Sj,!0);V(document,"click",Sj);V(document,"focus",Sj,!0);V(document,"mouseover",Sj);V(document,"mouseout",Sj);V(document,"mousedown",Sj);V(document,"keydown",Sj);V(document,"keyup",Sj);V(document,"keypress",Sj);V(document,"cut",Sj);V(document,"paste",Sj);Qj&&(V(document,"touchstart",Sj),V(document,"touchend",Sj),V(document,"touchcancel",Sj));function Tj(a){this.o=a;this.A={};this.F=[];this.B=[]}
m=Tj.prototype;m.J=function(a){return K(a,W(this))};
function W(a,b){return"yt-uix"+(a.o?"-"+a.o:"")+(b?"-"+b:"")}
m.unregister=function(){ej(this.F);this.F.length=0;xj(this.B);this.B.length=0};
m.init=Ia;m.dispose=Ia;function Uj(a,b,c){a.F.push(cj(b,c,a))}
function Vj(a,b,c){a.B.push(wj(b,c,a))}
function X(a,b,c,d){d=W(a,d);var e=z(c,a);b in Pj||(Pj[b]=new Q);Pj[b].subscribe(d,e);a.A[c]=e}
function Y(a,b,c,d){if(b in Pj){var e=Pj[b];yi(e,W(a,d),a.A[c]);0>=Ai(e)&&(e.dispose(),delete Pj[b])}delete a.A[c]}
m.Y=function(a,b,c){var d=this.l(a,b);if(d&&(d=y(d))){var e=rb(arguments,2);qb(e,0,0,a);d.apply(null,e)}};
m.l=function(a,b){return jj(a,b)};
function Wj(a,b){hj(a,"tooltip-text",b)}
;var Xj=window.yt&&window.yt.uix&&window.yt.uix.widgets_||{};A("yt.uix.widgets_",Xj);function Yj(a){var b=[];zb(a,function(c,d){var e=encodeURIComponent(String(d)),f;Array.isArray(c)?f=c:f=[c];E(f,function(g){""==g?b.push(e):b.push(e+"="+encodeURIComponent(String(g)))})});
return b.join("&")}
function Zj(a){"?"==a.charAt(0)&&(a=a.substr(1));a=a.split("&");for(var b={},c=0,d=a.length;c<d;c++){var e=a[c].split("=");if(1==e.length&&e[0]||2==e.length)try{var f=decodeURIComponent((e[0]||"").replace(/\+/g," ")),g=decodeURIComponent((e[1]||"").replace(/\+/g," "));f in b?Array.isArray(b[f])?pb(b[f],g):b[f]=[b[f],g]:b[f]=g}catch(k){if("q"!=e[0]){var h=Error("Error decoding URL component");h.params={key:e[0],value:e[1]};Vi(h)}}}return b}
function ak(a){return-1!=a.indexOf("?")?(a=(a||"").split("#")[0],a=a.split("?",2),Zj(1<a.length?a[1]:a[0])):{}}
function bk(a,b,c){var d=a.split("#",2);a=d[0];d=1<d.length?"#"+d[1]:"";var e=a.split("?",2);a=e[0];e=Zj(e[1]||"");for(var f in b)!c&&null!==e&&f in e||(e[f]=b[f]);return Jf(a,e)+d}
function ck(a){if(!b)var b=window.location.href;var c=Cf(1,a),d=Df(a);c&&d?(a=a.match(Af),b=b.match(Af),a=a[3]==b[3]&&a[1]==b[1]&&a[4]==b[4]):a=d?Df(b)==d&&(Number(Cf(4,b))||null)==(Number(Cf(4,a))||null):!0;return a}
;function dk(a){a=void 0===a?{}:a;"function"===typeof a&&(a={callback:a});if(a.gapiHintOverride||R("GAPI_HINT_OVERRIDE")){var b=ak(document.location.href).gapi_jsh;b&&Gb(a,{_c:{jsl:{h:b}}})}mh("gapi.iframes:gapi.iframes.style.common",a)}
;function ek(){return y("gapi.iframes.getContext")()}
;function fk(a){S.call(this,1,arguments);this.f=a}
D(fk,S);function gk(a){S.call(this,1,arguments);this.f=a}
D(gk,S);function hk(a,b,c){S.call(this,3,arguments);this.i=a;this.g=b;this.f=null!=c?!!c:null}
D(hk,S);function ik(a,b,c,d,e,f){S.call(this,2,arguments);this.f=a;this.g=b;this.j=c||null;this.i=d||null;this.source=e||null;this.params=f||null}
D(ik,S);function jk(a,b,c){S.call(this,1,arguments);this.f=a;this.g=b}
D(jk,S);function kk(a,b,c,d,e,f,g,h){S.call(this,1,arguments);this.f=a;this.o=b;this.g=c;this.v=d||null;this.j=e||null;this.i=f||null;this.source=g||null;this.params=h||null}
D(kk,S);
var lk=new T("subscription-batch-subscribe",fk),mk=new T("subscription-batch-unsubscribe",fk),nk=new T("subscription-subscribe",ik),ok=new T("subscription-subscribe-loading",gk),pk=new T("subscription-subscribe-loaded",gk),qk=new T("subscription-subscribe-success",jk),rk=new T("subscription-subscribe-external",ik),sk=new T("subscription-unsubscribe",kk),tk=new T("subscription-unsubscirbe-loading",gk),uk=new T("subscription-unsubscribe-loaded",gk),vk=new T("subscription-unsubscribe-success",gk),wk=
new T("subscription-external-unsubscribe",kk),xk=new T("subscription-enable-ypc",gk),yk=new T("subscription-disable-ypc",gk),zk=new T("subscription-prefs",hk),Ak=new T("subscription-prefs-success",hk),Bk=new T("subscription-prefs-failure",hk);function Ck(){var a=void 0===a?!1:a;var b=Dj();if(a)for(;b&&b.shadowRoot;)b=b.shadowRoot.fullscreenElement;return b?b:null}
;function Dk(a,b){(a=I(a))&&a.style&&(a.style.display=b?"":"none",ei(a,"hid",!b))}
function Ek(a){return(a=I(a))?"none"!=a.style.display&&!O(a,"hid"):!1}
function Fk(a){E(arguments,function(b){!La(b)||b instanceof Element?Dk(b,!0):E(b,function(c){Fk(c)})})}
function Gk(a){E(arguments,function(b){!La(b)||b instanceof Element?Dk(b,!1):E(b,function(c){Gk(c)})})}
(function(a,b){function c(f){var g=v(f);f=g.next().value;g=fa(g);return a.apply(f,g)}
function d(f){f=v(f);f.next();f=fa(f);return b(e,f)}
b=void 0===b?qi:b;var e=Pa(a);return function(f){for(var g=[],h=0;h<arguments.length;++h)g[h-0]=arguments[h];h=this||x;var k=pi.get(h);k||(k={},pi.set(h,k));return cc(k,[this].concat(ha(g)),c,d)}})(function(a){var b=Ad(document,"DIV");
a&&(b.className=a);b.style.cssText="overflow:auto;position:absolute;top:0;width:100px;height:100px";a=Ad(document,"DIV");hg(a,"200px","200px");b.appendChild(a);document.body.appendChild(b);a=b.offsetWidth-b.clientWidth;Bd(b);return a});function Hk(){Tj.call(this,"tooltip");this.f=0;this.g={}}
D(Hk,Tj);Ja(Hk);m=Hk.prototype;m.register=function(){X(this,"mouseover",this.ja);X(this,"mouseout",this.V);X(this,"focus",this.Da);X(this,"blur",this.wa);X(this,"click",this.V);X(this,"touchstart",this.eb);X(this,"touchend",this.la);X(this,"touchcancel",this.la)};
m.unregister=function(){Y(this,"mouseover",this.ja);Y(this,"mouseout",this.V);Y(this,"focus",this.Da);Y(this,"blur",this.wa);Y(this,"click",this.V);Y(this,"touchstart",this.eb);Y(this,"touchend",this.la);Y(this,"touchcancel",this.la);this.dispose();Hk.D.unregister.call(this)};
m.dispose=function(){for(var a in this.g)this.V(this.g[a]);this.g={}};
m.ja=function(a){if(!(this.f&&1E3>Va()-this.f)){var b=parseInt(this.l(a,"tooltip-hide-timer"),10);b&&(kj(a,"tooltip-hide-timer"),Yi(b));b=z(function(){Ik(this,a);kj(a,"tooltip-show-timer")},this);
var c=parseInt(this.l(a,"tooltip-show-delay"),10)||0;b=Xi(b,c);hj(a,"tooltip-show-timer",b.toString());a.title&&(Wj(a,Jk(this,a)),a.title="");b=Pa(a).toString();this.g[b]=a}};
m.V=function(a){var b=parseInt(this.l(a,"tooltip-show-timer"),10);b&&(Yi(b),kj(a,"tooltip-show-timer"));b=z(function(){if(a){var c=I(Kk(this,a));c&&(Lk(c),Bd(c),kj(a,"content-id"));c=I(Kk(this,a,"arialabel"));Bd(c)}kj(a,"tooltip-hide-timer")},this);
b=Xi(b,50);hj(a,"tooltip-hide-timer",b.toString());if(b=this.l(a,"tooltip-text"))a.title=b;b=Pa(a).toString();delete this.g[b]};
m.Da=function(a,b){this.f=0;this.ja(a,b)};
m.wa=function(a){this.f=0;this.V(a)};
m.eb=function(a,b,c){c.changedTouches&&(this.f=0,(a=Rj(b,W(this),c.changedTouches[0].target))&&this.ja(a,b))};
m.la=function(a,b,c){c.changedTouches&&(this.f=Va(),(a=Rj(b,W(this),c.changedTouches[0].target))&&this.V(a))};
function Mk(a,b,c){Wj(b,c);a=a.l(b,"content-id");(a=I(a))&&Fd(a,c)}
function Jk(a,b){return a.l(b,"tooltip-text")||b.title}
function Ik(a,b){if(b){var c=Jk(a,b);if(c){var d=I(Kk(a,b));if(!d){d=document.createElement("div");d.id=Kk(a,b);ai(d,W(a,"tip"));var e=document.createElement("div");ai(e,W(a,"tip-body"));var f=document.createElement("div");ai(f,W(a,"tip-arrow"));var g=document.createElement("div");g.setAttribute("aria-hidden","true");ai(g,W(a,"tip-content"));var h=Nk(a,b),k=Kk(a,b,"content");g.id=k;hj(b,"content-id",k);e.appendChild(g);h&&d.appendChild(h);d.appendChild(e);d.appendChild(f);var l=Nd(b);k=Kk(a,b,"arialabel");
f=document.createElement("div");P(f,W(a,"arialabel"));f.id=k;l=b.hasAttribute("aria-label")?b.getAttribute("aria-label"):"rtl"==document.body.getAttribute("dir")?c+" "+l:l+" "+c;Fd(f,l);b.setAttribute("aria-labelledby",k);k=Ck()||document.body;k.appendChild(f);k.appendChild(d);Mk(a,b,c);(c=parseInt(a.l(b,"tooltip-max-width"),10))&&e.offsetWidth>c&&(e.style.width=c+"px",P(g,W(a,"normal-wrap")));g=O(b,W(a,"reverse"));Ok(a,b,d,e,h,g)||Ok(a,b,d,e,h,!g);var n=W(a,"tip-visible");Xi(function(){P(d,n)},0)}}}}
function Ok(a,b,c,d,e,f){ei(c,W(a,"tip-reverse"),f);var g=0;f&&(g=1);var h=jg(b);f=new H((h.width-10)/2,f?h.height:0);var k=fg(b);wi(new H(k.x+f.x,k.y+f.y),c,g);f=vd(window);if(1==c.nodeType)var l=gg(c);else c=c.changedTouches?c.changedTouches[0]:c,l=new H(c.clientX,c.clientY);c=jg(d);var n=Math.floor(c.width/2);g=!!(f.height<l.y+h.height);h=!!(l.y<h.height);k=!!(l.x<n);f=!!(f.width<l.x+n);l=(c.width+3)/-2- -5;a=a.l(b,"force-tooltip-direction");if("left"==a||k)l=-5;else if("right"==a||f)l=20-c.width-
3;a=Math.floor(l)+"px";d.style.left=a;e&&(e.style.left=a,e.style.height=c.height+"px",e.style.width=c.width+"px");return!(g||h)}
function Kk(a,b,c){a=W(a)+zj(b);c&&(a+="-"+c);return a}
function Nk(a,b){var c=null;jc&&O(b,W(a,"masked"))&&((c=I("yt-uix-tooltip-shared-mask"))?(c.parentNode.removeChild(c),Fk(c)):(c=Ad(document,"IFRAME"),c.src='javascript:""',c.id="yt-uix-tooltip-shared-mask",ai(c,W(a,"tip-mask"))));return c}
function Lk(a){var b=I("yt-uix-tooltip-shared-mask"),c=b&&Qd(b,function(d){return d==a},!1,2);
b&&c&&(b.parentNode.removeChild(b),Gk(b),document.body.appendChild(b))}
;function Pk(a){var b=Qk();if(b=window.open(b,"loginPopup","width=375,height=440,resizable=yes,scrollbars=yes",!0)){var c=cj("LOGGED_IN",function(d){ej(R("LOGGED_IN_PUBSUB_KEY",void 0));Ri("LOGGED_IN",!0);a(d)});
Ri("LOGGED_IN_PUBSUB_KEY",c);b.moveTo((screen.width-375)/2,(screen.height-440)/2)}}
function Qk(){var a=document.location.protocol+"//"+document.domain+"/post_login";a=If(a,"mode","subscribe");a=If("/signin?context=popup","next",a);return a=If(a,"feature","sub_button")}
A("yt.pubsub.publish",fj);function Z(a){a=Rk(a);return"string"===typeof a&&"false"===a?!1:!!a}
function Sk(a,b){var c=Rk(a);return void 0===c&&void 0!==b?b:Number(c||0)}
function Rk(a){var b=R("EXPERIMENTS_FORCED_FLAGS",{});return void 0!==b[a]?b[a]:R("EXPERIMENT_FLAGS",{})[a]}
function Tk(){var a=[],b=R("EXPERIMENTS_FORCED_FLAGS",{});for(c in b)a.push({key:c,value:String(b[c])});var c=R("EXPERIMENT_FLAGS",{});for(var d in c)d.startsWith("force_")&&void 0===b[d]&&a.push({key:d,value:String(c[d])});return a}
;var Uk=window,Vk=Uk.ytcsi&&Uk.ytcsi.now?Uk.ytcsi.now:Uk.performance&&Uk.performance.timing&&Uk.performance.now&&Uk.performance.timing.navigationStart?function(){return Uk.performance.timing.navigationStart+Uk.performance.now()}:function(){return(new Date).getTime()};var Wk=Sk("initial_gel_batch_timeout",1E3),Xk=Math.pow(2,16)-1,Yk=null,Zk=0,$k=void 0,al=0,bl=0,cl=0,dl=!0,el=x.ytLoggingTransportLogPayloadsQueue_||{};A("ytLoggingTransportLogPayloadsQueue_",el);var fl=x.ytLoggingTransportGELQueue_||new Map;A("ytLoggingTransportGELQueue_",fl);var gl=x.ytLoggingTransportTokensToCttTargetIds_||{};A("ytLoggingTransportTokensToCttTargetIds_",gl);
function hl(){Yi(al);Yi(bl);bl=0;$k&&$k.isReady()?(il(fl),"log_event"in el&&il(Object.entries(el.log_event)),fl.clear(),delete el.log_event):jl()}
function jl(){Z("web_gel_timeout_cap")&&!bl&&(bl=Xi(hl,6E4));Yi(al);var a=R("LOGGING_BATCH_TIMEOUT",Sk("web_gel_debounce_ms",1E4));Z("shorten_initial_gel_batch_timeout")&&dl&&(a=Wk);al=Xi(hl,a)}
function il(a){var b=$k,c=Math.round(Vk());a=v(a);for(var d=a.next();!d.done;d=a.next()){var e=v(d.value);d=e.next().value;var f=e.next().value;e=Eb({context:kl(b.f||ll())});e.events=f;(f=gl[d])&&ml(e,d,f);delete gl[d];nl(e,c);ol(b,"log_event",e,{retry:!0,onSuccess:function(){Zk=Math.round(Vk()-c)}});
dl=!1}}
function nl(a,b){a.requestTimeMs=String(b);Z("unsplit_gel_payloads_in_logs")&&(a.unsplitGelPayloadsInLogs=!0);var c=R("EVENT_ID",void 0);if(c){var d=R("BATCH_CLIENT_COUNTER",void 0)||0;!d&&Z("web_client_counter_random_seed")&&(d=Math.floor(Math.random()*Xk/2));d++;d>Xk&&(d=1);Ri("BATCH_CLIENT_COUNTER",d);c={serializedEventId:c,clientCounter:String(d)};a.serializedClientEventId=c;Yk&&Zk&&Z("log_gel_rtt_web")&&(a.previousBatchInfo={serializedClientEventId:Yk,roundtripMs:String(Zk)});Yk=c;Zk=0}}
function ml(a,b,c){if(c.videoId)var d="VIDEO";else if(c.playlistId)d="PLAYLIST";else return;a.credentialTransferTokenTargetId=c;a.context=a.context||{};a.context.user=a.context.user||{};a.context.user.credentialTransferTokens=[{token:b,scope:d}]}
;var pl=x.ytLoggingGelSequenceIdObj_||{};A("ytLoggingGelSequenceIdObj_",pl);
function ql(a,b,c,d){d=void 0===d?{}:d;var e={};e.eventTimeMs=Math.round(d.timestamp||Vk());e[a]=b;a=String;d.timestamp?b=-1:(b=y("_lact",window),b=null==b?-1:Math.max(Va()-b,0));e.context={lastActivityMs:a(b)};Z("log_sequence_info_on_gel_web")&&d.ab&&(a=e.context,b=d.ab,pl[b]=b in pl?pl[b]+1:0,a.sequence={index:pl[b],groupKey:b},d.uc&&delete pl[d.ab]);d=d.tc;a="";d&&(a={},d.videoId?a.videoId=d.videoId:d.playlistId&&(a.playlistId=d.playlistId),gl[d.token]=a,a=d.token);d=fl.get(a)||[];fl.set(a,d);
d.push(e);c&&($k=new c);c=Sk("web_logging_max_batch")||100;e=Vk();d.length>=c?hl():10<=e-cl&&(jl(),cl=e)}
;function rl(a){var b=sl;a=void 0===a?y("yt.ads.biscotti.lastId_")||"":a;b=Object.assign(tl(b),ul(b));b.ca_type="image";a&&(b.bid=a);return b}
function tl(a){var b={};b.dt=rg;b.flash="0";a:{try{var c=a.f.top.location.href}catch(f){a=2;break a}a=c?c===a.g.location.href?0:1:2}b=(b.frm=a,b);b.u_tz=-(new Date).getTimezoneOffset();var d=void 0===d?xf:d;try{var e=d.history.length}catch(f){e=0}b.u_his=e;b.u_java=!!xf.navigator&&"unknown"!==typeof xf.navigator.javaEnabled&&!!xf.navigator.javaEnabled&&xf.navigator.javaEnabled();xf.screen&&(b.u_h=xf.screen.height,b.u_w=xf.screen.width,b.u_ah=xf.screen.availHeight,b.u_aw=xf.screen.availWidth,b.u_cd=
xf.screen.colorDepth);xf.navigator&&xf.navigator.plugins&&(b.u_nplug=xf.navigator.plugins.length);xf.navigator&&xf.navigator.mimeTypes&&(b.u_nmime=xf.navigator.mimeTypes.length);return b}
function ul(a){var b=a.f;try{var c=b.screenX;var d=b.screenY}catch(l){}try{var e=b.outerWidth;var f=b.outerHeight}catch(l){}try{var g=b.innerWidth;var h=b.innerHeight}catch(l){}b=[b.screenLeft,b.screenTop,c,d,b.screen?b.screen.availWidth:void 0,b.screen?b.screen.availTop:void 0,e,f,g,h];c=a.f.top;try{var k=vd(c||window).round()}catch(l){k=new nd(-12245933,-12245933)}c=k;k={};d=new Oh;x.SVGElement&&x.document.createElementNS&&d.set(0);e=Sf();e["allow-top-navigation-by-user-activation"]&&d.set(1);e["allow-popups-to-escape-sandbox"]&&
d.set(2);x.crypto&&x.crypto.subtle&&d.set(3);x.TextDecoder&&x.TextEncoder&&d.set(4);d=Ph(d);k.bc=d;k.bih=c.height;k.biw=c.width;k.brdim=b.join();a=a.g;return k.vis={visible:1,hidden:2,prerender:3,preview:4,unloaded:5}[a.visibilityState||a.webkitVisibilityState||a.mozVisibilityState||""]||0,k.wgl=!!xf.WebGLRenderingContext,k}
var sl=new function(){var a=window.document;this.f=window;this.g=a};
A("yt.ads_.signals_.getAdSignalsString",function(a){return Yj(rl(a))});Va();var vl="XMLHttpRequest"in x?function(){return new XMLHttpRequest}:null;
function wl(){if(!vl)return null;var a=vl();return"open"in a?a:null}
;var xl={Authorization:"AUTHORIZATION","X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-YouTube-Device":"DEVICE","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL","X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},yl="app debugcss debugjs expflag force_ad_params force_viral_ad_response_params forced_experiments innertube_snapshots innertube_goldens internalcountrycode internalipoverride absolute_experiments conditional_experiments sbb sr_bns_address".split(" "),
zl=!1;function Al(a,b){b=void 0===b?{}:b;var c=ck(a),d=Z("web_ajax_ignore_global_headers_if_set"),e;for(e in xl){var f=R(xl[e]);!f||!c&&Df(a)||d&&void 0!==b[e]||(b[e]=f)}if(c||!Df(a))b["X-YouTube-Utc-Offset"]=String(-(new Date).getTimezoneOffset());(c||!Df(a))&&(d="undefined"!=typeof Intl?(new Intl.DateTimeFormat).resolvedOptions().timeZone:null)&&(b["X-YouTube-Time-Zone"]=d);if(c||!Df(a))b["X-YouTube-Ad-Signals"]=Yj(rl(void 0));return b}
function Bl(a){var b=window.location.search,c=Df(a),d=Bf(Cf(5,a));d=(c=c&&(c.endsWith("youtube.com")||c.endsWith("youtube-nocookie.com")))&&d&&d.startsWith("/api/");if(!c||d)return a;var e=Zj(b),f={};E(yl,function(g){e[g]&&(f[g]=e[g])});
return bk(a,f||{},!1)}
function Cl(a,b){if(window.fetch&&"XML"!=b.format){var c={method:b.method||"GET",credentials:"same-origin"};b.headers&&(c.headers=b.headers);a=Dl(a,b);var d=El(a,b);d&&(c.body=d);b.withCredentials&&(c.credentials="include");var e=!1,f;fetch(a,c).then(function(g){if(!e){e=!0;f&&Yi(f);var h=g.ok,k=function(l){l=l||{};var n=b.context||x;h?b.onSuccess&&b.onSuccess.call(n,l,g):b.onError&&b.onError.call(n,l,g);b.ca&&b.ca.call(n,l,g)};
"JSON"==(b.format||"JSON")&&(h||400<=g.status&&500>g.status)?g.json().then(k,function(){k(null)}):k(null)}});
b.Va&&0<b.timeout&&(f=Xi(function(){e||(e=!0,Yi(f),b.Va.call(b.context||x))},b.timeout))}else Fl(a,b)}
function Fl(a,b){var c=b.format||"JSON";a=Dl(a,b);var d=El(a,b),e=!1,f=Gl(a,function(k){if(!e){e=!0;h&&Yi(h);a:switch(k&&"status"in k?k.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:var l=!0;break a;default:l=!1}var n=null,p=400<=k.status&&500>k.status,q=500<=k.status&&600>k.status;if(l||p||q)n=Hl(a,c,k,b.sc);if(l)a:if(k&&204==k.status)l=!0;else{switch(c){case "XML":l=0==parseInt(n&&n.return_code,10);break a;case "RAW":l=!0;break a}l=!!n}n=n||{};p=b.context||x;
l?b.onSuccess&&b.onSuccess.call(p,k,n):b.onError&&b.onError.call(p,k,n);b.ca&&b.ca.call(p,k,n)}},b.method,d,b.headers,b.responseType,b.withCredentials);
if(b.ka&&0<b.timeout){var g=b.ka;var h=Xi(function(){e||(e=!0,f.abort(),Yi(h),g.call(b.context||x,f))},b.timeout)}}
function Dl(a,b){b.xc&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=R("XSRF_FIELD_NAME",void 0),d=b.ta;d&&(d[c]&&delete d[c],a=bk(a,d||{},!0));return a}
function El(a,b){var c=R("XSRF_FIELD_NAME",void 0),d=R("XSRF_TOKEN",void 0),e=b.postBody||"",f=b.G,g=R("XSRF_FIELD_NAME",void 0),h;b.headers&&(h=b.headers["Content-Type"]);b.vc||Df(a)&&!b.withCredentials&&Df(a)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.G&&b.G[g]||(f||(f={}),f[c]=d);f&&"string"===typeof e&&(e=Zj(e),Gb(e,f),e=b.Ya&&"JSON"==b.Ya?JSON.stringify(e):Hf(e));if(!(c=e)&&(c=f)){a:{for(var k in f){f=!1;break a}f=!0}c=!f}!zl&&c&&"POST"!=b.method&&
(zl=!0,Vi(Error("AJAX request with postData should use POST")));return e}
function Hl(a,b,c,d){var e=null;switch(b){case "JSON":try{var f=c.responseText}catch(g){throw d=Error("Error reading responseText"),d.params=a,Wi(d),g;}a=c.getResponseHeader("Content-Type")||"";f&&0<=a.indexOf("json")&&(e=JSON.parse(f));break;case "XML":if(a=(a=c.responseXML)?Il(a):null)e={},E(a.getElementsByTagName("*"),function(g){e[g.tagName]=Jl(g)})}d&&Kl(e);
return e}
function Kl(a){if(Oa(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;var d=a[b],e;void 0===Mb&&(Mb=Xa("goog#html"));d=(e=Mb)?e.createHTML(d):d;a[c]=new Qb(d,null,Sb)}else Kl(a[b])}}
function Il(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function Jl(a){var b="";E(a.childNodes,function(c){b+=c.nodeValue});
return b}
function Gl(a,b,c,d,e,f,g){function h(){4==(k&&"readyState"in k?k.readyState:0)&&b&&Ui(b)(k)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var k=wl();if(!k)return null;"onloadend"in k?k.addEventListener("loadend",h,!1):k.onreadystatechange=h;Z("debug_forward_web_query_parameters")&&(a=Bl(a));k.open(c,a,!0);f&&(k.responseType=f);g&&(k.withCredentials=!0);c="POST"==c&&(void 0===window.FormData||!(d instanceof FormData));if(e=Al(a,e))for(var l in e)k.setRequestHeader(l,e[l]),"content-type"==l.toLowerCase()&&(c=!1);c&&k.setRequestHeader("Content-Type","application/x-www-form-urlencoded");k.send(d);
return k}
;function Ll(){for(var a={},b=v(Object.entries(Zj(R("DEVICE","")))),c=b.next();!c.done;c=b.next()){var d=v(c.value);c=d.next().value;d=d.next().value;"cbrand"===c?a.deviceMake=d:"cmodel"===c?a.deviceModel=d:"cbr"===c?a.browserName=d:"cbrver"===c?a.browserVersion=d:"cos"===c?a.osName=d:"cosver"===c?a.osVersion=d:"cplatform"===c&&(a.platform=d)}return a}
;function Ml(){return"INNERTUBE_API_KEY"in Qi&&"INNERTUBE_API_VERSION"in Qi}
function ll(){return{innertubeApiKey:R("INNERTUBE_API_KEY",void 0),innertubeApiVersion:R("INNERTUBE_API_VERSION",void 0),Ab:R("INNERTUBE_CONTEXT_CLIENT_CONFIG_INFO"),Bb:R("INNERTUBE_CONTEXT_CLIENT_NAME","WEB"),innertubeContextClientVersion:R("INNERTUBE_CONTEXT_CLIENT_VERSION",void 0),Db:R("INNERTUBE_CONTEXT_HL",void 0),Cb:R("INNERTUBE_CONTEXT_GL",void 0),Eb:R("INNERTUBE_HOST_OVERRIDE",void 0)||"",Gb:!!R("INNERTUBE_USE_THIRD_PARTY_AUTH",!1),Fb:!!R("INNERTUBE_OMIT_API_KEY_WHEN_AUTH_HEADER_IS_PRESENT",
!1)}}
function kl(a){a={client:{hl:a.Db,gl:a.Cb,clientName:a.Bb,clientVersion:a.innertubeContextClientVersion,configInfo:a.Ab}};var b=window.devicePixelRatio;b&&1!=b&&(a.client.screenDensityFloat=String(b));b=R("EXPERIMENTS_TOKEN","");""!==b&&(a.client.experimentsToken=b);b=Tk();0<b.length&&(a.request={internalExperimentFlags:b});R("DELEGATED_SESSION_ID")&&!Z("pageid_as_header_web")&&(a.user={onBehalfOfUser:R("DELEGATED_SESSION_ID")});a.client=Object.assign(a.client,Ll());return a}
function Nl(a,b,c){c=void 0===c?{}:c;var d={"X-Goog-Visitor-Id":c.visitorData||R("VISITOR_DATA","")};if(b&&b.includes("www.youtube-nocookie.com"))return d;(b=c.pc||R("AUTHORIZATION"))||(a?b="Bearer "+y("gapi.auth.getToken")().oc:b=Hg([]));b&&(d.Authorization=b,d["X-Goog-AuthUser"]=R("SESSION_INDEX",0),Z("pageid_as_header_web")&&(d["X-Goog-PageId"]=R("DELEGATED_SESSION_ID")));return d}
;function Ol(a){a=Object.assign({},a);delete a.Authorization;var b=Hg();if(b){var c=new ph;c.update(R("INNERTUBE_API_KEY",void 0));c.update(b);a.hash=Ze(c.digest(),3)}return a}
function Pl(a){a=Ol(a);var b=new ph;b.update(JSON.stringify(a,Object.keys(a).sort()));a=b.digest();b="";for(var c=0;c<a.length;c++)b+="0123456789ABCDEF".charAt(Math.floor(a[c]/16))+"0123456789ABCDEF".charAt(a[c]%16);return b}
;function Ql(a,b,c,d,e){zf.set(""+a,b,{Ma:c,path:"/",domain:void 0===d?"youtube.com":d,secure:void 0===e?!1:e})}
function Rl(a){return zf.get(""+a,void 0)}
;function Sl(){var a=new Ji;(a=a.isAvailable()?new Pi(a,"yt.innertube"):null)||(a=new Ki("yt.innertube"),a=a.isAvailable()?a:null);this.f=a?new Fi(a):null;this.g=document.domain||window.location.hostname}
Sl.prototype.set=function(a,b,c,d){c=c||31104E3;this.remove(a);if(this.f)try{this.f.set(a,b,Va()+1E3*c);return}catch(f){}var e="";if(d)try{e=escape(ji(b))}catch(f){return}else e=escape(b);Ql(a,e,c,this.g)};
Sl.prototype.get=function(a,b){var c=void 0,d=!this.f;if(!d)try{c=this.f.get(a)}catch(e){d=!0}if(d&&(c=Rl(a))&&(c=unescape(c),b))try{c=JSON.parse(c)}catch(e){this.remove(a),c=void 0}return c};
Sl.prototype.remove=function(a){this.f&&this.f.remove(a);var b=this.g;zf.remove(""+a,"/",void 0===b?"youtube.com":b)};var Tl;function Ul(){Tl||(Tl=new Sl);return Tl}
function Vl(a,b,c,d){if(d)return null;d=Ul().get("nextId",!0)||1;var e=Ul().get("requests",!0)||{};e[d]={method:a,request:b,authState:Ol(c),requestTime:Math.round(Vk())};Ul().set("nextId",d+1,86400,!0);Ul().set("requests",e,86400,!0);return d}
function Wl(a){var b=Ul().get("requests",!0)||{};delete b[a];Ul().set("requests",b,86400,!0)}
function Xl(a){var b=Ul().get("requests",!0);if(b){for(var c in b){var d=b[c];if(!(6E4>Math.round(Vk())-d.requestTime)){var e=d.authState,f=Ol(Nl(!1));Db(e,f)&&(e=d.request,"requestTimeMs"in e&&(e.requestTimeMs=Math.round(Vk())),ol(a,d.method,e,{}));delete b[c]}}Ul().set("requests",b,86400,!0)}}
;function Yl(){}
function Zl(){var a={},b=Hg([]);b&&(a.Authorization=b,a["X-Goog-AuthUser"]=R("SESSION_INDEX",0),"INNERTUBE_HOST_OVERRIDE"in Qi||(a["X-Origin"]=window.location.origin),Z("pageid_as_header_web")&&"DELEGATED_SESSION_ID"in Qi&&(a["X-Goog-PageId"]=R("DELEGATED_SESSION_ID")));return a}
;var $l={identityType:"UNAUTHENTICATED_IDENTITY_TYPE_UNKNOWN"};var am=Se||Te;function bm(a){if(!a)throw Error();throw a;}
function cm(a){return a}
function dm(a){var b=this;this.g=a;this.state={status:"PENDING"};this.f=[];this.onRejected=[];this.g(function(c){if("PENDING"===b.state.status){b.state={status:"FULFILLED",value:c};c=v(b.f);for(var d=c.next();!d.done;d=c.next())d=d.value,d()}},function(c){if("PENDING"===b.state.status){b.state={status:"REJECTED",
reason:c};c=v(b.onRejected);for(var d=c.next();!d.done;d=c.next())d=d.value,d()}})}
dm.all=function(a){return new dm(function(b,c){var d=[],e=a.length;0===e&&b(d);for(var f={W:0};f.W<a.length;f={W:f.W},++f.W)em(dm.resolve(a[f.W]).then(function(g){return function(h){d[g.W]=h;e--;0===e&&b(d)}}(f)),function(g){c(g)})})};
dm.resolve=function(a){return new dm(function(b,c){a instanceof dm?a.then(b,c):b(a)})};
dm.reject=function(a){return new dm(function(b,c){c(a)})};
dm.prototype.then=function(a,b){var c=this,d=null!==a&&void 0!==a?a:cm,e=null!==b&&void 0!==b?b:bm;return new dm(function(f,g){"PENDING"===c.state.status?(c.f.push(function(){fm(c,c,d,f,g)}),c.onRejected.push(function(){gm(c,c,e,f,g)})):"FULFILLED"===c.state.status?fm(c,c,d,f,g):"REJECTED"===c.state.status&&gm(c,c,e,f,g)})};
function em(a,b){a.then(void 0,b)}
function fm(a,b,c,d,e){try{if("FULFILLED"!==a.state.status)throw Error("calling handleResolve before the promise is fulfilled.");var f=c(a.state.value);f instanceof dm?hm(a,b,f,d,e):d(f)}catch(g){e(g)}}
function gm(a,b,c,d,e){try{if("REJECTED"!==a.state.status)throw Error("calling handleReject before the promise is rejected.");var f=c(a.state.reason);f instanceof dm?hm(a,b,f,d,e):d(f)}catch(g){e(g)}}
function hm(a,b,c,d,e){b===c?e(new TypeError("Circular promise chain detected.")):c.then(function(f){f instanceof dm?hm(a,b,f,d,e):d(f)},function(f){e(f)})}
;function im(){var a=Error.call(this,"Transaction was aborted");this.message=a.message;"stack"in a&&(this.stack=a.stack);Object.setPrototypeOf(this,im.prototype)}
qa(im,Error);function jm(a){return a instanceof DOMException?"VersionError"===a.name:"DOMError"in self&&a instanceof DOMError?"VersionError"===a.name:a instanceof Object&&"message"in a?"An attempt was made to open a database using a lower version than the existing version."===a.message:!1}
function km(a,b){return new dm(function(c,d){function e(){var f=a?b(a):null;f?f.then(function(g){a=g;e()},d):c()}
e()})}
;function lm(a){return new de(function(b,c){function d(){c(a.error);f()}
function e(){b(a.result);f()}
function f(){a.removeEventListener("success",e);a.removeEventListener("error",d)}
a.addEventListener("success",e);a.addEventListener("error",d)})}
function mm(a){return new dm(function(b,c){function d(){c(a.error);f()}
function e(){b(a.result);f()}
function f(){a.removeEventListener("success",e);a.removeEventListener("error",d)}
a.addEventListener("success",e);a.addEventListener("error",d)})}
;function nm(a){this.f=a}
m=nm.prototype;m.add=function(a,b,c){return om(this,[a],"readwrite",function(d){return pm(d,a).add(b,c)})};
m.clear=function(a){return om(this,[a],"readwrite",function(b){return pm(b,a).clear()})};
m.close=function(){this.f.close()};
m.count=function(a,b){return om(this,[a],"readonly",function(c){return pm(c,a).count(b)})};
function qm(a,b,c){a=a.f.createObjectStore(b,c);return new rm(a)}
m["delete"]=function(a,b){return om(this,[a],"readwrite",function(c){return pm(c,a)["delete"](b)})};
m.get=function(a,b){return om(this,[a],"readwrite",function(c){return pm(c,a).get(b)})};
function sm(a,b){return om(a,["databases"],"readwrite",function(c){return tm(pm(c,"databases"),b,void 0)})}
function om(a,b,c,d){c=void 0===c?"readonly":c;return new de(function(e,f){var g=a.f.transaction(b,c),h=new um(g,b);em(d(h).then(function(k){ne(vm(h).then(function(){e(k)}),function(l){f(l)})}),function(k){f(k)})})}
function rm(a){this.f=a}
m=rm.prototype;m.add=function(a,b){var c=b?this.f.add(a,b):this.f.add(a);return mm(c)};
m.clear=function(){return mm(this.f.clear()).then(function(){})};
m.count=function(a){a=a?this.f.count(a):this.f.count();return mm(a)};
m["delete"]=function(a){return mm(this.f["delete"](a))};
m.get=function(a){return mm(this.f.get(a))};
m.index=function(a){return new wm(this.f.index(a))};
m.getName=function(){return this.f.name};
function tm(a,b,c){a=c?a.f.put(b,c):a.f.put(b);return mm(a)}
function um(a){var b=this;this.f=a;this.g=new Map;this.aborted=!1;this.done=new de(function(c,d){b.f.addEventListener("complete",function(){c()});
b.f.addEventListener("error",function(e){e.currentTarget===e.target&&d(b.f.error)});
b.f.addEventListener("abort",function(){var e=b.f.error;e?("QuotaExceededError"===e.name?Wi(Error("The current transaction exceeded its quota limitations.")):"UnknownError"===e.name&&Wi(Error("The current transaction may have failed because of exceeding quota limitations.")),d(e)):d(new im)})})}
um.prototype.abort=function(){this.f.abort();this.aborted=!0};
function vm(a){var b=a.f;b.commit&&!a.aborted&&b.commit();return a.done}
function pm(a,b){var c=a.f.objectStore(b),d=a.g.get(c);d||(d=new rm(c),a.g.set(c,d));return d}
function wm(a){this.f=a}
wm.prototype.count=function(a){a=a?this.f.count(a):this.f.count();return mm(a)};
wm.prototype.get=function(a){return mm(this.f.get(a))};
function xm(a,b,c){a=a.f.openCursor(void 0===b.query?null:b.query,void 0===b.direction?"next":b.direction);return ym(a).then(function(d){return km(d,c)})}
function zm(a,b){this.request=a;this.f=b}
function ym(a){return mm(a).then(function(b){return null===b?null:new zm(a,b)})}
zm.prototype["delete"]=function(){return mm(this.f["delete"]()).then(function(){})};
zm.prototype.update=function(a){return mm(this.f.update(a))};function Am(a,b,c){function d(){n||(n=new nm(f.result));return n}
var e=um;var f=void 0!==b?self.indexedDB.open(a,b):self.indexedDB.open(a);var g=c.blocked,h=c.blocking,k=c.f,l=c.upgrade,n;l&&f.addEventListener("upgradeneeded",function(p){if(null===p.newVersion)throw Error("Invariant: newVersion on IDbVersionChangeEvent is null");if(null===f.transaction)throw Error("Invariant: transaction on IDbOpenDbRequest is null");var q=d(),r=new e(f.transaction);l(q,p.oldVersion,p.newVersion,r)});
g&&f.addEventListener("blocked",function(){g()});
return lm(f).then(function(p){h&&p.addEventListener("versionchange",function(){h(d())});
k&&p.addEventListener("close",function(){k()});
return d()})}
function Bm(a,b,c){c=void 0===c?{}:c;return Am(a,b,c)}
;var Cm,Dm,Em=["getAll","getAllKeys","getKey","openKeyCursor"],Fm=["getAll","getAllKeys","getKey","openKeyCursor"];function Gm(){var a;if(a=am)a=/WebKit\/([0-9]+)/.exec(wb),a=!!(a&&600<=parseInt(a[1],10));a&&(a=/WebKit\/([0-9]+)/.exec(wb),a=!(a&&602<=parseInt(a[1],10)));return a&&!Z("ytidb_allow_on_ios_safari_v8_and_v9")?!1:!!self.indexedDB}
function Hm(){return new Promise(function(a){setTimeout(a,50)})}
function Im(){return He(this,function b(){var c,d,e;return Da(b,function(f){switch(f.f){case 1:if(!Gm())return f["return"](!1);ua(f);d=!1;return w(f,Bm("yt-idb-test-do-not-use",void 0,{blocking:function(){d=!0;c&&(c.close(),c=void 0)}}),5);
case 5:return c=f.g,e=Bm("yt-idb-test-do-not-use",c.f.version+1).then(function(g){try{g.close()}catch(h){}}),w(f,Promise.race([e,
Hm()]),6);case 6:return f["return"](d);case 3:wa(f);if(c)try{c.close()}catch(g){}xa(f);break;case 2:return va(f),f["return"](!1)}})})}
function Jm(){return void 0!==Cm?ie(Cm):new de(function(a){Im().then(function(b){Cm=b;a(b)})})}
function Km(){return void 0!==Dm?ie(Dm):Jm().then(function(a){if(!a)return!1;var b=v(Em);for(a=b.next();!a.done;a=b.next())if(!IDBObjectStore.prototype[a.value])return!1;b=v(Fm);for(a=b.next();!a.done;a=b.next())if(!IDBIndex.prototype[a.value])return!1;return IDBObjectStore.prototype.getKey?!0:!1}).then(function(a){return Dm=a})}
;var Lm;function Mm(){function a(b){b.close();Lm=void 0}
Lm||(Lm=ne(Bm("YtIdbMeta",1,{blocking:a,upgrade:function(b,c){1>c&&qm(b,"databases",{keyPath:"actualName"})}}),function(b){return jm(b)?Bm("YtIdbMeta",void 0,{blocking:a}):je(b)}));
return Lm}
function Nm(a){return Mm().then(function(b){return b.get("databases",a.actualName).then(function(c){if(c?a.actualName!==c.actualName||a.publicName!==c.publicName||a.userIdentifier!==c.userIdentifier||a.signedIn!==c.signedIn:1)return sm(b,a)})})}
function Om(a){return Mm().then(function(b){return b["delete"]("databases",a)})}
;function Pm(a){try{var b={actualName:"LogsDataBase",publicName:"LogsDataBase",userIdentifier:void 0,signedIn:!1}}catch(c){return je(c)}return ne(Nm(b).then(function(){return a(b)}),function(c){return ne(Om(b.actualName),function(){}).then(function(){return je(c)})})}
function Qm(a,b){b=void 0===b?{}:b;return Pm(function(c){return Bm(c.actualName,a,b)})}
;function Rm(){dm.call(this,function(){});
throw Error("Not allowed to instantiate the thennable outside of the core library.");}
qa(Rm,dm);Rm.reject=dm.reject;Rm.resolve=dm.resolve;Rm.all=dm.all;var Sm;function Tm(){return He(this,function b(){return Da(b,function(c){if(!Sm)try{Sm=Qm(1,{upgrade:function(d,e){1>e&&(qm(d,"LogsRequestsStore",{keyPath:"id",autoIncrement:!0}).f.createIndex("newRequest",["status","authHash","timestamp"],{unique:!1}),qm(d,"sapisid"))}})}catch(d){if(!jm(d))return Vi(d),c["return"](Promise.reject(d));
Sm=Qm()}return c["return"](Sm)})})}
function Um(a){return He(this,function c(){var d,e,f;return Da(c,function(g){if(1==g.f)return w(g,Vm(),2);if(3!=g.f)return d=g.g,w(g,Tm(),3);e=g.g;f=Object.assign(Object.assign({},a),{options:JSON.parse(JSON.stringify(a.options)),authHash:d});return g["return"](e.add("LogsRequestsStore",f))})})}
function Wm(){return He(this,function b(){var c,d,e,f,g,h;return Da(b,function(k){switch(k.f){case 1:return w(k,Vm(),2);case 2:return c=k.g,d=["NEW",c,0],e=["NEW",c,Vk()],f=IDBKeyRange.bound(d,e),w(k,Tm(),3);case 3:return g=k.g,h=void 0,w(k,om(g,["LogsRequestsStore"],"readwrite",function(l){return xm(pm(l,"LogsRequestsStore").index("newRequest"),{query:f,direction:"prev"},function(n){n.f.value&&(h=n.f.value,h.status="QUEUED",n.update(h))})}),4);
case 4:return k["return"](h)}})})}
function Xm(a){return He(this,function c(){var d;return Da(c,function(e){if(1==e.f)return w(e,Tm(),2);d=e.g;return e["return"](om(d,["LogsRequestsStore"],"readwrite",function(f){var g=pm(f,"LogsRequestsStore");return g.get(a).then(function(h){if(h)return h.status="QUEUED",tm(g,h).then(function(){return h})})}))})})}
function Ym(a){return He(this,function c(){var d;return Da(c,function(e){if(1==e.f)return w(e,Tm(),2);d=e.g;return e["return"](om(d,["LogsRequestsStore"],"readwrite",function(f){var g=pm(f,"LogsRequestsStore");return g.get(a).then(function(h){return h?(h.status="NEW",h.sendCount+=1,tm(g,h).then(function(){return h})):Rm.resolve(void 0)})}))})})}
function Zm(){return He(this,function b(){var c,d;return Da(b,function(e){if(1==e.f)return w(e,Tm(),2);if(3!=e.f)return c=e.g,w(e,c.count("LogsRequestsStore"),3);d=e.g;return e["return"](!d)})})}
function $m(a){return He(this,function c(){var d;return Da(c,function(e){if(1==e.f)return w(e,Tm(),2);d=e.g;return e["return"](d["delete"]("LogsRequestsStore",a))})})}
function Vm(){return He(this,function b(){var c;return Da(b,function(d){if(1==d.f){Yl.f||(Yl.f=new Yl);var e=ie(Zl());return w(d,e,2)}c=d.g;return d["return"](Pl(c))})})}
;var an=Sk("network_polling_interval",3E4);function bn(){this.j=0;this.f=window.navigator.onLine;cn(this);dn(this)}
function en(){bn.f||(bn.f=new bn);return bn.f}
function fn(a){var b=gn,c=hn;(new de(function(d){a.g=d})).then(function(){b();
c&&(a.i=c)});
jn(a)}
function dn(a){window.addEventListener("online",function(){a.f=!0;a.g&&a.g()})}
function cn(a){window.addEventListener("offline",function(){a.f=!1;a.i&&a.i()})}
function jn(a){a.j||(kn(a),window.navigator.onLine&&a.g&&a.g())}
function kn(a){a.j=nj(function(){window.navigator.onLine?(!1===a.f&&Vi(Error("NetworkStatusManager missed online event.")),a.f=!0,a.g&&a.g()):(!0===a.f&&Vi(Error("NetworkStatusManager missed offline event.")),a.f=!1,a.i&&a.i());kn(a)},an)}
;var ln=Sk("networkless_throttle_timeout")||100,mn=Sk("networkless_retry_attempts")||1,nn=0;function on(a,b){b=void 0===b?{}:b;pn().then(function(c){if(c&&!Z("networkless_bypass_write")){var d={url:a,options:b,timestamp:Vk(),status:"NEW",sendCount:0};Um(d).then(function(e){d.id=e;e=en();e.f&&!Z("networkless_always_offline")?qn(d):fn(e)})["catch"](function(e){qn(d);
Vi(e)})}else Fl(a,b)})}
function gn(){nn||(nn=pj(function(){qn();nn=0;gn()},ln))}
function hn(){var a=nn;if(!isNaN(a)){var b=y("yt.scheduler.instance.cancelJob");b?b(a):Yi(a)}nn=0}
function qn(a){He(this,function c(){var d=this,e,f,g,h,k;return Da(c,function(l){switch(l.f){case 1:e=d;if(!a)return w(l,Wm(),6);if(!a.id){l.N(3);break}return w(l,Xm(a.id),5);case 5:(f=l.g)?a=f:Wi(Error("The request cannot be found in the database."));l.N(3);break;case 6:if(a=l.g){l.N(3);break}return w(l,Zm(),8);case 8:return(g=l.g)&&hn(),l["return"]();case 3:if(rn(a))h=a.options.onError?a.options.onError:function(){},k=a.options.onSuccess?a.options.onSuccess:function(){},a.options.onError=function(n,
p){return He(e,function r(){return Da(r,function(u){if(1==u.f)return a&&a.id?a.sendCount<mn?w(u,Ym(a.id),6):w(u,$m(a.id),2):u.N(2);
2!=u.f&&(nn||fn(en()),h(n,p));h(n,p);u.f=0})})},a.options.onSuccess=function(n,p){return He(e,function r(){return Da(r,function(u){if(1==u.f)return a&&a.id?w(u,$m(a.id),2):u.N(2);
k(n,p);u.f=0})})},Fl(a.url,a.options);
else if(Wi(Error("Networkless Logging: Stored logs request expired age limit")),a.id)return w(l,$m(a.id),0);l.N(0)}})})}
function rn(a){a=a.timestamp;return 2592E6<=Vk()-a?!1:!0}
function pn(){return He(this,function b(){return Da(b,function(c){return Z("networkless_logging")?(2===Sk("networkless_ytidb_version")&&Km().then(function(d){return d}),c["return"](Gm())):c["return"](!1)})})}
;function sn(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];d=Error.call(this,a);this.message=d.message;"stack"in d&&(this.stack=d.stack);this.args=[].concat(ha(c))}
qa(sn,Error);function tn(a){var b=this;this.f=null;a?this.f=a:Ml()&&(this.f=ll());nj(function(){Xl(b)},5E3)}
tn.prototype.isReady=function(){!this.f&&Ml()&&(this.f=ll());return!!this.f};
function ol(a,b,c,d){!R("VISITOR_DATA")&&"visitor_id"!==b&&.01>Math.random()&&Wi(new sn("Missing VISITOR_DATA when sending innertube request.",b,c,d));if(!a.isReady()){var e=new sn("innertube xhrclient not ready",b,c,d);Vi(e);e.sampleWeight=0;throw e;}var f={headers:{"Content-Type":"application/json"},method:"POST",G:c,Ya:"JSON",ka:function(){d.ka()},
Va:d.ka,onSuccess:function(p,q){if(d.onSuccess)d.onSuccess(q)},
Ua:function(p){if(d.onSuccess)d.onSuccess(p)},
onError:function(p,q){if(d.onError)d.onError(q)},
yc:function(p){if(d.onError)d.onError(p)},
timeout:d.timeout,withCredentials:!0},g="";(e=a.f.Eb)&&(g=e);var h=a.f.Gb||!1,k=Nl(h,g,d);Object.assign(f.headers,k);f.headers.Authorization&&!g&&(f.headers["x-origin"]=window.location.origin);e="/youtubei/"+a.f.innertubeApiVersion+"/"+b;var l={alt:"json"};a.f.Fb&&f.headers.Authorization||(l.key=a.f.innertubeApiKey);var n=bk(""+g+e,l||{},!0);pn().then(function(p){if(d.retry&&Z("retry_web_logging_batches")&&"www.youtube-nocookie.com"!=g){if(Z("networkless_gel")&&!p||!Z("networkless_gel"))var q=Vl(b,
c,k,h);if(q){var r=f.onSuccess,u=f.Ua;f.onSuccess=function(B,C){Wl(q);r(B,C)};
c.Ua=function(B,C){Wl(q);u(B,C)}}}try{Z("use_fetch_for_op_xhr")?Cl(n,f):Z("networkless_gel")&&d.retry?(f.method="POST",on(n,f)):(f.method="POST",f.G||(f.G={}),Fl(n,f))}catch(B){if("InvalidAccessError"==B.name)q&&(Wl(q),q=0),Wi(Error("An extension is blocking network request."));
else throw B;}q&&nj(function(){Xl(a)},5E3)})}
;var un=Va().toString();var vn;
if(!(vn=x.ytLoggingDocDocumentNonce_)){var wn;a:{if(window.crypto&&window.crypto.getRandomValues)try{var xn=Array(16),yn=new Uint8Array(16);window.crypto.getRandomValues(yn);for(var zn=0;zn<xn.length;zn++)xn[zn]=yn[zn];wn=xn;break a}catch(a){}for(var An=Array(16),Bn=0;16>Bn;Bn++){for(var Cn=Va(),Dn=0;Dn<Cn%23;Dn++)An[Bn]=Math.random();An[Bn]=Math.floor(256*Math.random())}if(un)for(var En=1,Fn=0;Fn<un.length;Fn++)An[En%16]=An[En%16]^An[(En-1)%16]/4^un.charCodeAt(Fn),En++;wn=An}for(var Gn=wn,Hn=[],
In=0;In<Gn.length;In++)Hn.push("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(Gn[In]&63));vn=Hn.join("")}var Jn=vn;A("ytLoggingDocDocumentNonce_",Jn);function Kn(a){a=void 0===a?0:a;return 0==a?"client-screen-nonce":"client-screen-nonce."+a}
function Ln(a){a=void 0===a?0:a;return 0==a?"ROOT_VE_TYPE":"ROOT_VE_TYPE."+a}
A("yt_logging_screen.getRootVeType",function(a){return R(Ln(void 0===a?0:a),void 0)});
function Mn(){var a=R("csn-to-ctt-auth-info");a||(a={},Ri("csn-to-ctt-auth-info",a));return a}
function Nn(a){a=void 0===a?0:a;var b=R(Kn(a));if(!b&&!R("USE_CSN_FALLBACK",!0))return null;b||0!=a||(Z("kevlar_client_side_screens")||Z("c3_client_side_screens")?b="UNDEFINED_CSN":b=R("EVENT_ID"));return b?b:null}
A("yt_logging_screen.getCurrentCsn",Nn);function On(a,b,c){var d=Mn();(c=Nn(c))&&delete d[c];b&&(d[a]=b)}
A("yt_logging_screen.getCttAuthInfo",function(a){return Mn()[a]});
A("yt_logging_screen.setCurrentScreen",function(a,b,c,d){c=void 0===c?0:c;if(a!==R(Kn(c))||b!==R(Ln(c)))if(On(a,d,c),Ri(Kn(c),a),Ri(Ln(c),b),0==c||Z("web_screen_associated_all_layers"))b=function(){setTimeout(function(){a&&ql("foregroundHeartbeatScreenAssociated",{clientDocumentNonce:Jn,clientScreenNonce:a},tn)},0)},"requestAnimationFrame"in window?window.requestAnimationFrame(b):b()});function Pn(){Tj.call(this,"button");this.f=null;this.i=[];this.g={}}
D(Pn,Tj);Ja(Pn);m=Pn.prototype;m.register=function(){X(this,"click",this.fb);X(this,"keydown",this.Ka);X(this,"keypress",this.La);Uj(this,"page-scroll",this.xb)};
m.unregister=function(){Y(this,"click",this.fb);Y(this,"keydown",this.Ka);Y(this,"keypress",this.La);Qn(this);this.g={};Pn.D.unregister.call(this)};
m.fb=function(a){a&&!a.disabled&&(this.toggle(a),this.click(a))};
m.Ka=function(a,b,c){if(!(c.altKey||c.ctrlKey||c.shiftKey||c.metaKey)&&(b=Rn(this,a))){var d=function(g){var h="";g.tagName&&(h=g.tagName.toLowerCase());return"ul"==h||"table"==h},e;
d(b)?e=b:e=Gd(b,d);if(e){e=e.tagName.toLowerCase();if("ul"==e)var f=this.Lb;else"table"==e&&(f=this.Kb);f&&Sn(this,a,b,c,z(f,this))}}};
m.xb=function(){var a=this.g,b=0;for(d in a)b++;if(0!=b)for(var c in a){b=a[c];var d=K(b.activeButtonNode||b.parentNode,W(this));if(void 0==d||void 0==b)break;Tn(this,d,b,!0)}};
function Sn(a,b,c,d,e){var f=Ek(c),g=9==d.keyCode;if(g||32==d.keyCode||13==d.keyCode)if(d=Un(a,c)){if(void 0!==d.firstElementChild)b=d.firstElementChild;else for(b=d.firstChild;b&&1!=b.nodeType;)b=b.nextSibling;if("a"==b.tagName.toLowerCase()){var h=void 0===h?{}:h;var k=void 0===k?"":k;var l=void 0===l?window:l;l=l.location;h=Jf(b.href,h)+k;h instanceof Nb||h instanceof Nb||(h="object"==typeof h&&h.pa?h.oa():String(h),Pb.test(h)||(h="about:invalid#zClosurez"),h=new Nb(h,Ob));h instanceof Nb&&h.constructor===
Nb?h=h.f:(Ka(h),h="type_error:SafeUrl");l.href=h}else Nj(b)}else g&&Vn(a,b);else f?27==d.keyCode?(Un(a,c),Vn(a,b)):e(b,c,d):(h=O(b,W(a,"reverse"))?38:40,d.keyCode==h&&(Nj(b),d.preventDefault()))}
m.La=function(a,b,c){c.altKey||c.ctrlKey||c.shiftKey||c.metaKey||(a=Rn(this,a),Ek(a)&&c.preventDefault())};
function Un(a,b){var c=W(a,"menu-item-highlight"),d=J(c,b);d&&ci(d,c);return d}
function Wn(a,b,c){P(c,W(a,"menu-item-highlight"));var d=c.getAttribute("id");d||(d=W(a,"item-id-"+Pa(c)),c.setAttribute("id",d));b.setAttribute("aria-activedescendant",d)}
m.Kb=function(a,b,c){var d=Un(this,b);b=Cj("table",b);var e=Cj("tr",b);e=sd(document,"td",null,e).length;b=sd(document,"td",null,b);d=Xn(d,b,e,c);-1!=d&&(Wn(this,a,b[d]),c.preventDefault())};
m.Lb=function(a,b,c){if(40==c.keyCode||38==c.keyCode){var d=Un(this,b);b=gb(sd(document,"li",null,b),Ek);d=Xn(d,b,1,c);Wn(this,a,b[d]);c.preventDefault()}};
function Xn(a,b,c,d){var e=b.length;a=fb(b,a);if(-1==a)if(38==d.keyCode)a=e-c;else{if(37==d.keyCode||38==d.keyCode||40==d.keyCode)a=0}else 39==d.keyCode?(a%c==c-1&&(a-=c),a+=1):37==d.keyCode?(0==a%c&&(a+=c),--a):38==d.keyCode?(a<c&&(a+=e),a-=c):40==d.keyCode&&(a>=e-c&&(a-=e),a+=c);return a}
function Yn(a,b){var c=b.iframeMask;c||(c=Ad(document,"IFRAME"),c.src='javascript:""',ai(c,W(a,"menu-mask")),Gk(c),b.iframeMask=c);return c}
function Tn(a,b,c,d){var e=K(b,W(a,"group")),f=!!a.l(b,"button-menu-ignore-group");e=e&&!f?e:b;f=9;var g=8,h=lg(b);if(O(b,W(a,"reverse"))){f=8;g=9;h=h.top+"px";try{c.style.maxHeight=h}catch(n){}}O(b,"flip")&&(O(b,W(a,"reverse"))?(f=12,g=13):(f=13,g=12));var k;a.l(b,"button-has-sibling-menu")?k=dg(e):a.l(b,"button-menu-root-container")&&(k=Zn(a,b));G&&!wc("8")&&(k=null);if(k){var l=lg(k);l=new Tf(-l.top,l.left,l.top,-l.left)}k=new H(0,1);O(b,W(a,"center-menu"))&&(k.x-=Math.round((jg(c).width-jg(b).width)/
2));d&&(k.y+=xd(document).y);if(a=Yn(a,b))b=jg(c),a.style.width=b.width+"px",a.style.height=b.height+"px",ui(e,f,a,g,k,l,197),d&&Yf(a,"position","fixed");ui(e,f,c,g,k,l,197)}
function Zn(a,b){if(a.l(b,"button-menu-root-container")){var c=a.l(b,"button-menu-root-container");return K(b,c)}return document.body}
m.hb=function(a){if(a){var b=Rn(this,a);if(b){a.setAttribute("aria-pressed","true");a.setAttribute("aria-expanded","true");b.originalParentNode=b.parentNode;b.activeButtonNode=a;b.parentNode.removeChild(b);var c;this.l(a,"button-has-sibling-menu")?c=a.parentNode:c=Zn(this,a);c.appendChild(b);b.style.minWidth=a.offsetWidth-2+"px";var d=Yn(this,a);d&&c.appendChild(d);(c=!!this.l(a,"button-menu-fixed"))&&(this.g[zj(a).toString()]=b);Tn(this,a,b,c);gj("yt-uix-button-menu-before-show",a,b);Fk(b);d&&Fk(d);
this.Y(a,"button-menu-action",!0);P(a,W(this,"active"));b=z(this.gb,this,a,!1);d=z(this.gb,this,a,!0);c=z(this.Xb,this,a,void 0);this.f&&Rn(this,this.f)==Rn(this,a)||Qn(this);fj("yt-uix-button-menu-show",a);Oj(this.i);this.i=[V(document,"click",d),V(document,"contextmenu",b),V(window,"resize",c)];this.f=a}}};
function Vn(a,b){if(b){var c=Rn(a,b);if(c){a.f=null;b.setAttribute("aria-pressed","false");b.setAttribute("aria-expanded","false");b.removeAttribute("aria-activedescendant");Gk(c);a.Y(b,"button-menu-action",!1);var d=Yn(a,b),e=zj(c).toString();delete a.g[e];Xi(function(){d&&d.parentNode&&(Gk(d),d.parentNode.removeChild(d));c.originalParentNode&&(c.parentNode.removeChild(c),c.originalParentNode.appendChild(c),c.originalParentNode=null,c.activeButtonNode=null)},1)}e=K(b,W(a,"group"));
var f=[W(a,"active")];e&&f.push(W(a,"group-active"));di(b,f);fj("yt-uix-button-menu-hide",b);Oj(a.i);a.i.length=0}}
m.Xb=function(a,b){var c=Rn(this,a);if(c){b&&(b instanceof Qb?Wb(c,b):Fd(c,b));var d=!!this.l(a,"button-menu-fixed");Tn(this,a,c,d)}};
m.gb=function(a,b,c){c=Lj(c);var d=K(c,W(this));if(d){d=Rn(this,d);var e=Rn(this,a);if(d==e)return}d=K(c,W(this,"menu"));e=d==Rn(this,a);var f=O(c,W(this,"menu-item")),g=O(c,W(this,"menu-close"));if(!d||e&&(f||g))Vn(this,a),d&&b&&this.l(a,"button-menu-indicate-selected")&&((a=J(W(this,"content"),a))&&Fd(a,Nd(c)),$n(this,d,c))};
function $n(a,b,c){var d=W(a,"menu-item-selected");a=rd(d,b);E(a,function(e){ci(e,d)});
P(c.parentNode,d)}
function Rn(a,b){if(!b.widgetMenu){var c=a.l(b,"button-menu-id");c=c&&I(c);var d=W(a,"menu");c?bi(c,[d,W(a,"menu-external")]):c=J(d,b);b.widgetMenu=c}return b.widgetMenu}
m.isToggled=function(a){return O(a,W(this,"toggled"))};
m.toggle=function(a){if(this.l(a,"button-toggle")){var b=K(a,W(this,"group")),c=W(this,"toggled"),d=O(a,c);if(b&&this.l(b,"button-toggle-group")){var e=this.l(b,"button-toggle-group");b=rd(W(this),b);E(b,function(f){f!=a||"optional"==e&&d?(ci(f,c),f.removeAttribute("aria-pressed")):(P(a,c),f.setAttribute("aria-pressed","true"))})}else d?a.removeAttribute("aria-pressed"):a.setAttribute("aria-pressed","true"),gi(a,c)}};
m.click=function(a){if(Rn(this,a)){var b=Rn(this,a);if(b){var c=K(b.activeButtonNode||b.parentNode,W(this));c&&c!=a?(Vn(this,c),Xi(z(this.hb,this,a),1)):Ek(b)?Vn(this,a):this.hb(a)}a.focus()}this.Y(a,"button-action")};
function Qn(a){a.f&&Vn(a,a.f)}
;function ao(a){Tj.call(this,a);this.i=null}
D(ao,Tj);m=ao.prototype;m.J=function(a){var b=Tj.prototype.J.call(this,a);return b?b:a};
m.register=function(){Uj(this,"yt-uix-kbd-nav-move-out-done",this.hide)};
m.dispose=function(){bo(this);ao.D.dispose.call(this)};
m.l=function(a,b){var c=ao.D.l.call(this,a,b);return c?c:(c=ao.D.l.call(this,a,"card-config"))&&(c=y(c))&&c[b]?c[b]:null};
m.show=function(a){var b=this.J(a);if(b){P(b,W(this,"active"));var c=co(this,a,b);if(c){c.cardTargetNode=a;c.cardRootNode=b;eo(this,a,c);var d=W(this,"card-visible"),e=this.l(a,"card-delegate-show")&&this.l(b,"card-action");this.Y(b,"card-action",a);this.i=a;Gk(c);Xi(z(function(){e||(Fk(c),fj("yt-uix-card-show",b,a,c));fo(c);P(c,d);fj("yt-uix-kbd-nav-move-in-to",c)},this),10)}}};
function co(a,b,c){var d=c||b,e=W(a,"card");c=go(a,d);var f=I(W(a,"card")+zj(d));if(f)return a=J(W(a,"card-body"),f),Ed(a,c)||(Bd(c),a.appendChild(c)),f;f=document.createElement("div");f.id=W(a,"card")+zj(d);ai(f,e);(d=a.l(d,"card-class"))&&bi(f,d.split(/\s+/));d=document.createElement("div");d.className=W(a,"card-border");b=a.l(b,"orientation")||"horizontal";e=document.createElement("div");e.className="yt-uix-card-border-arrow yt-uix-card-border-arrow-"+b;var g=document.createElement("div");g.className=
W(a,"card-body");a=document.createElement("div");a.className="yt-uix-card-body-arrow yt-uix-card-body-arrow-"+b;Bd(c);g.appendChild(c);d.appendChild(a);d.appendChild(g);f.appendChild(e);f.appendChild(d);document.body.appendChild(f);return f}
function eo(a,b,c){var d=a.l(b,"orientation")||"horizontal";var e=J(W(a,"anchor"),b)||b;var f=a.l(b,"position"),g=!!a.l(b,"force-position"),h=a.l(b,"position-fixed");d="horizontal"==d;var k="bottomright"==f||"bottomleft"==f,l="topright"==f||"bottomright"==f;if(l&&k){var n=13;var p=8}else l&&!k?(n=12,p=9):!l&&k?(n=9,p=12):(n=8,p=13);var q=mg(document.body);f=mg(b);q!=f&&(n^=4);if(d){f=b.offsetHeight/2-12;var r=new H(-12,b.offsetHeight+6)}else f=b.offsetWidth/2-6,r=new H(b.offsetWidth+6,-12);var u=
jg(c);f=Math.min(f,(d?u.height:u.width)-24-6);6>f&&(f=6,d?r.y+=12-b.offsetHeight/2:r.x+=12-b.offsetWidth/2);u=null;g||(u=10);b=W(a,"card-flip");a=W(a,"card-reverse");ei(c,b,l);ei(c,a,k);u=ui(e,n,c,p,r,null,u);!g&&u&&(u&48&&(l=!l,n^=4,p^=4),u&192&&(k=!k,n^=1,p^=1),ei(c,b,l),ei(c,a,k),ui(e,n,c,p,r));h&&(e=parseInt(c.style.top,10),g=xd(document).y,Yf(c,"position","fixed"),Yf(c,"top",e-g+"px"));q&&(c.style.right="",e=lg(c),e.left=e.left||parseInt(c.style.left,10),g=vd(window),c.style.left="",c.style.right=
g.width-e.left-e.width+"px");e=J("yt-uix-card-body-arrow",c);g=J("yt-uix-card-border-arrow",c);d=d?k?"top":"bottom":!q&&l||q&&!l?"left":"right";e.setAttribute("style","");g.setAttribute("style","");e.style[d]=f+"px";g.style[d]=f+"px";k=J("yt-uix-card-arrow",c);l=J("yt-uix-card-arrow-background",c);k&&l&&(c="right"==d?jg(c).width-f-13:f+11,f=c/Math.sqrt(2),k.style.left=c+"px",k.style.marginLeft="1px",l.style.marginLeft=-f+"px",l.style.marginTop=f+"px")}
m.hide=function(a){if(a=this.J(a)){var b=I(W(this,"card")+zj(a));b&&(ci(a,W(this,"active")),ci(b,W(this,"card-visible")),Gk(b),this.i=null,b.cardTargetNode=null,b.cardRootNode=null,b.cardMask&&(Bd(b.cardMask),b.cardMask=null))}};
function bo(a){a.i&&a.hide(a.i)}
m.Wb=function(a,b){var c=this.J(a);if(c){if(b){var d=go(this,c);if(!d)return;b instanceof Qb?Wb(d,b):Fd(d,b)}O(c,W(this,"active"))&&(c=co(this,a,c),eo(this,a,c),Fk(c),fo(c))}};
m.isActive=function(a){return(a=this.J(a))?O(a,W(this,"active")):!1};
function go(a,b){var c=b.cardContentNode;if(!c){var d=W(a,"content"),e=W(a,"card-content");(c=(c=a.l(b,"card-id"))?I(c):J(d,b))||(c=document.createElement("div"));var f=c;ci(f,d);P(f,e);b.cardContentNode=c}return c}
function fo(a){var b=a.cardMask;b||(b=Ad(document,"IFRAME"),b.src='javascript:""',bi(b,["yt-uix-card-iframe-mask"]),a.cardMask=b);b.style.position=a.style.position;b.style.top=a.style.top;b.style.left=a.offsetLeft+"px";b.style.height=a.clientHeight+"px";b.style.width=a.clientWidth+"px";document.body.appendChild(b)}
;function ho(){Tj.call(this,"kbd-nav")}
var io;D(ho,Tj);Ja(ho);m=ho.prototype;m.register=function(){X(this,"keydown",this.Ha);Uj(this,"yt-uix-kbd-nav-move-in",this.Sa);Uj(this,"yt-uix-kbd-nav-move-in-to",this.Mb);Uj(this,"yt-uix-kbd-move-next",this.Ta);Uj(this,"yt-uix-kbd-nav-move-to",this.ga)};
m.unregister=function(){Y(this,"keydown",this.Ha);Oj(io)};
m.Ha=function(a,b,c){var d=c.keyCode;if(a=K(a,W(this)))switch(d){case 13:case 32:this.Sa(a);break;case 27:c.preventDefault();c.stopImmediatePropagation();a:{for(c=ii(a,"kbdNavMoveOut");!c;){c=K(a.parentElement,W(this));if(!c)break a;c=ii(c,"kbdNavMoveOut")}c=I(c);this.ga(c);fj("yt-uix-kbd-nav-move-out-done",c)}break;case 40:case 38:if((b=c.target)&&O(a,W(this,"list")))switch(d){case 40:this.Ta(b,a);break;case 38:d=document.activeElement==a,a=jo(a),b=a.indexOf(b),0>b&&!d||(b=d?a.length-1:(a.length+
b-1)%a.length,a[b].focus(),ko(this,a[b]))}c.preventDefault()}};
m.Sa=function(a){var b=ii(a,"kbdNavMoveIn");b=I(b);lo(this,a,b);this.ga(b)};
m.Mb=function(a){var b=document;try{var c=b&&b.activeElement;var d=c&&c.nodeName?c:null}catch(e){d=null}lo(this,d,a);this.ga(a)};
m.ga=function(a){if(a)if(Kd(a))a.focus();else{var b=Gd(a,function(c){return Dd(c)?Kd(c):!1});
b?b.focus():(a.setAttribute("tabindex","-1"),a.focus())}};
function lo(a,b,c){if(b&&c)if(P(c,W(a)),a=b.id,a||(a="kbd-nav-"+Math.floor(1E6*Math.random()+1),b.id=a),b=a,hi&&c.dataset)c.dataset.kbdNavMoveOut=b;else{if(/-[a-z]/.test("kbdNavMoveOut"))throw Error("");c.setAttribute("data-"+"kbdNavMoveOut".replace(/([A-Z])/g,"-$1").toLowerCase(),b)}}
m.Ta=function(a,b){var c=document.activeElement==b,d=jo(b),e=d.indexOf(a);0>e&&!c||(c=c?0:(e+1)%d.length,d[c].focus(),ko(this,d[c]))};
function ko(a,b){if(b){var c=Pd(b,"LI");c&&(P(c,W(a,"highlight")),io=V(b,"blur",z(function(d){ci(d,W(this,"highlight"));Oj(io)},a,c)))}}
function jo(a){if("UL"!=a.tagName.toUpperCase())return[];a=gb(Cd(a),function(b){return"LI"==b.tagName.toUpperCase()});
return gb(hb(a,function(b){return Ek(b)?Gd(b,function(c){return Dd(c)?Kd(c):!1}):!1}),function(b){return!!b})}
;function mo(){Tj.call(this,"menu");this.g=this.f=null;this.i={};this.v={};this.j=null}
D(mo,Tj);Ja(mo);function no(a){var b=mo.C();if(O(a,W(b)))return a;var c=b.J(a);return c?c:K(a,W(b,"content"))==b.f?b.g:null}
m=mo.prototype;m.register=function(){X(this,"click",this.Ga);X(this,"mouseenter",this.vb);Uj(this,"page-scroll",this.yb);Uj(this,"yt-uix-kbd-nav-move-out-done",function(a){a=this.J(a);oo(this,a)});
this.j=new Q};
m.unregister=function(){Y(this,"click",this.Ga);this.g=this.f=null;Oj(sb(Ab(this.i)));this.i={};zb(this.v,function(a){Bd(a)},this);
this.v={};db(this.j);this.j=null;mo.D.unregister.call(this)};
m.Ga=function(a,b,c){a&&(b=po(this,a),!b.disabled&&Bj(c.target,b)&&qo(this,a))};
m.vb=function(a,b,c){a&&O(a,W(this,"hover"))&&(b=po(this,a),Bj(c.target,b)&&qo(this,a,!0))};
m.yb=function(){this.f&&this.g&&ro(this,this.g,this.f)};
function ro(a,b,c){var d=so(a,b);d&&hg(d,jg(c));if(c==a.f){var e=9,f=8;O(b,W(a,"reversed"))&&(e^=1,f^=1);O(b,W(a,"flipped"))&&(e^=4,f^=4);a=new H(0,1);d&&ui(b,e,d,f,a,null,197);ui(b,e,c,f,a,null,197)}}
function qo(a,b,c){to(a,b)&&!c?oo(a,b):(uo(a,b),!a.f||Bj(b,a.f)?a.ib(b):xi(a.j,z(a.ib,a,b)))}
m.ib=function(a){if(a){var b=vo(this,a);if(b){gj("yt-uix-menu-before-show",a,b);if(this.f)Bj(a,this.f)||oo(this,this.g);else{this.g=a;this.f=b;O(a,W(this,"sibling-content"))||(Bd(b),document.body.appendChild(b));var c=po(this,a).offsetWidth-2;b.style.minWidth=c+"px"}(c=so(this,a))&&b.parentNode&&b.parentNode.insertBefore(c,b.nextSibling);ci(b,W(this,"content-hidden"));ro(this,a,b);bi(po(this,a),[W(this,"trigger-selected"),"yt-uix-button-toggled"]);fj("yt-uix-menu-show",a);wo(b);xo(this,a);fj("yt-uix-kbd-nav-move-in-to",
b);var d=z(this.Yb,this,a),e=z(this.Ib,this,a);c=Pa(a).toString();this.i[c]=[V(b,"click",e),V(document,"click",d)];O(a,W(this,"indicate-selected"))&&(d=z(this.Jb,this,a),this.i[c].push(V(b,"click",d)));O(a,W(this,"hover"))&&(a=z(this.wb,this,a),this.i[c].push(V(document,"mousemove",a)))}}};
m.wb=function(a,b){var c=Lj(b);if(c){var d=po(this,a);Bj(c,d)||yo(this,c)||zo(this,a)}};
m.Yb=function(a,b){var c=Lj(b);if(c){if(yo(this,c)){var d=K(c,W(this,"content")),e=Pd(c,"LI");e&&d&&Ed(d,e)&&gj("yt-uix-menu-item-clicked",c);c=K(c,W(this,"close-on-select"));if(!c)return;d=no(c)}oo(this,d||a)}};
function uo(a,b){if(b){var c=K(b,W(a,"content"));c&&(c=rd(W(a),c),E(c,function(d){!Bj(d,b)&&to(this,d)&&zo(this,d)},a))}}
function oo(a,b){if(b){var c=[];c.push(b);var d=vo(a,b);d&&(d=rd(W(a),d),d=ob(d),c=c.concat(d),E(c,function(e){to(this,e)&&zo(this,e)},a))}}
function zo(a,b){if(b){var c=vo(a,b);di(po(a,b),[W(a,"trigger-selected"),"yt-uix-button-toggled"]);P(c,W(a,"content-hidden"));var d=vo(a,b);d&&td(d,{"aria-expanded":"false"});(d=so(a,b))&&d.parentNode&&Bd(d);c&&c==a.f&&(a.g.appendChild(c),a.f=null,a.g=null,a.j&&a.j.M("ROOT_MENU_REMOVED"));fj("yt-uix-menu-hide",b);c=Pa(b).toString();Oj(a.i[c]);delete a.i[c]}}
m.Ib=function(a,b){var c=Lj(b);c&&Ao(this,a,c)};
m.Jb=function(a,b){var c=Lj(b);if(c){var d=po(this,a);if(d&&(c=Pd(c,"LI")))if(c=Nd(c).trim(),d.hasChildNodes()){var e=Pn.C();(d=J(W(e,"content"),d))&&Fd(d,c)}else Fd(d,c)}};
function xo(a,b){var c=vo(a,b);if(c){E(c.children,function(e){"LI"==e.tagName&&td(e,{role:"menuitem"})});
td(c,{"aria-expanded":"true"});var d=c.id;d||(d="aria-menu-id-"+Pa(c),c.id=d);(c=po(a,b))&&td(c,{"aria-controls":d})}}
function Ao(a,b,c){var d=vo(a,b);d&&O(b,W(a,"checked"))&&(a=Pd(c,"LI"))&&(a=J("yt-ui-menu-item-checked-hid",a))&&(d=rd("yt-ui-menu-item-checked",d),E(d,function(e){fi(e,"yt-ui-menu-item-checked","yt-ui-menu-item-checked-hid")}),fi(a,"yt-ui-menu-item-checked-hid","yt-ui-menu-item-checked"))}
function to(a,b){var c=vo(a,b);return c?!O(c,W(a,"content-hidden")):!1}
function wo(a){a=sd(document,"UL",null,a);E(a,function(b){b.tabIndex=0;var c=ho.C();bi(b,[W(c),W(c,"list")])})}
function vo(a,b){var c=jj(b,"menu-content-id");return c&&(c=I(c))?(bi(c,[W(a,"content"),W(a,"content-external")]),c):b==a.g?a.f:J(W(a,"content"),b)}
function so(a,b){var c=Pa(b).toString(),d=a.v[c];if(!d){d=Ad(document,"IFRAME");d.src='javascript:""';var e=[W(a,"mask")];E($h(b),function(f){e.push(f+"-mask")});
bi(d,e);a.v[c]=d}return d||null}
function po(a,b){return J(W(a,"trigger"),b)}
function yo(a,b){return Bj(b,a.f)||Bj(b,a.g)}
;function Bo(){ao.call(this,"clickcard");this.f={};this.g={}}
D(Bo,ao);Ja(Bo);m=Bo.prototype;m.register=function(){Bo.D.register.call(this);X(this,"click",this.Aa,"target");X(this,"click",this.za,"close")};
m.unregister=function(){Bo.D.unregister.call(this);Y(this,"click",this.Aa,"target");Y(this,"click",this.za,"close");for(var a in this.f)Oj(this.f[a]);this.f={};for(a in this.g)Oj(this.g[a]);this.g={}};
m.Aa=function(a,b,c){c.preventDefault();b=Pd(c.target,"button");if(!b||!b.disabled){if(b=this.l(a,"card-target"))a=document,a="string"===typeof b?a.getElementById(b):b;b=this.J(a);this.l(b,"disabled")||(O(b,W(this,"active"))?(this.hide(a),ci(b,W(this,"active"))):(this.show(a),P(b,W(this,"active"))))}};
m.show=function(a){Bo.D.show.call(this,a);var b=this.J(a),c=Pa(a).toString();if(!jj(b,"click-outside-persists")){if(this.f[c])return;b=V(document,"click",z(this.Ba,this,a));var d=V(window,"blur",z(this.Ba,this,a));this.f[c]=[b,d]}a=V(window,"resize",z(this.Wb,this,a,void 0));this.g[c]=a};
m.hide=function(a){Bo.D.hide.call(this,a);a=Pa(a).toString();var b=this.f[a];b&&(Oj(b),this.f[a]=null);if(b=this.g[a])Oj(b),delete this.g[a]};
m.Ba=function(a,b){var c="yt-uix"+(this.o?"-"+this.o:"")+"-card",d=null;b.target&&(d=K(b.target,c)||K(no(b.target),c));(d=d||K(document.activeElement,c)||(document.activeElement?K(no(document.activeElement),c):null))||this.hide(a)};
m.za=function(a){(a=K(a,W(this,"card")))&&(a=a.cardTargetNode)&&this.hide(a)};function Co(){ao.call(this,"hovercard")}
D(Co,ao);Ja(Co);m=Co.prototype;m.register=function(){X(this,"mouseenter",this.Oa,"target");X(this,"mouseleave",this.Qa,"target");X(this,"mouseenter",this.Pa,"card");X(this,"mouseleave",this.Ra,"card")};
m.unregister=function(){Y(this,"mouseenter",this.Oa,"target");Y(this,"mouseleave",this.Qa,"target");Y(this,"mouseenter",this.Pa,"card");Y(this,"mouseleave",this.Ra,"card")};
m.Oa=function(a){if(Do!=a){Do&&(this.hide(Do),Do=null);var b=z(this.show,this,a),c=parseInt(this.l(a,"delay-show"),10);b=Xi(b,-1<c?c:200);hj(a,"card-timer",b.toString());Do=a;a.alt&&(hj(a,"card-alt",a.alt),a.alt="");a.title&&(hj(a,"card-title",a.title),a.title="")}};
m.Qa=function(a){var b=parseInt(this.l(a,"card-timer"),10);Yi(b);this.J(a).isCardHidable=!0;b=parseInt(this.l(a,"delay-hide"),10);b=-1<b?b:200;Xi(z(this.zb,this,a),b);if(b=this.l(a,"card-alt"))a.alt=b;if(b=this.l(a,"card-title"))a.title=b};
m.zb=function(a){this.J(a).isCardHidable&&(this.hide(a),Do=null)};
m.Pa=function(a){a&&(a.cardRootNode.isCardHidable=!1)};
m.Ra=function(a){a&&this.hide(a.cardTargetNode)};
var Do=null;function Eo(a,b,c,d,e,f){this.f=a;this.A=null;this.i=J("yt-dialog-fg",this.f)||this.f;if(a=J("yt-dialog-title",this.i)){var g="yt-dialog-title-"+Pa(this.i);a.setAttribute("id",g);this.i.setAttribute("aria-labelledby",g)}this.i.setAttribute("tabindex","-1");this.O=J("yt-dialog-focus-trap",this.f);this.da=!1;this.j=new Q;this.B=[];this.B.push(Mj(this.f,z(this.Nb,this),"yt-dialog-dismiss"));this.B.push(V(this.O,"focus",z(this.tb,this),!0));Fo(this);this.ma=b;this.lb=c;this.kb=d;this.F=e;this.mb=f;this.v=
this.o=null}
var Go={LOADING:"loading",mc:"content",nc:"working"};function Ho(a,b){a.ia()||a.j.subscribe("post-all",b)}
function Fo(a){a=J("yt-dialog-fg-content",a.f);var b=[];zb(Go,function(c){b.push("yt-dialog-show-"+c)});
di(a,b);P(a,"yt-dialog-show-content")}
m=Eo.prototype;
m.show=function(){if(!this.ia()){this.A=document.activeElement;if(!this.kb){this.g||(this.g=I("yt-dialog-bg"),this.g||(this.g=Ad(document,"div"),this.g.id="yt-dialog-bg",ai(this.g,"yt-dialog-bg"),document.body.appendChild(this.g)));var a=window,b=a.document;var c=0;if(b){c=b.body;var d=b.documentElement;if(d&&c)if(a=vd(a).height,wd(b)&&d.scrollHeight)c=d.scrollHeight!=a?d.scrollHeight:d.offsetHeight;else{b=d.scrollHeight;var e=d.offsetHeight;d.clientHeight!=e&&(b=c.scrollHeight,e=c.offsetHeight);c=
b>a?b>e?b:e:b<e?b:e}else c=0}this.g.style.height=c+"px";Fk(this.g)}this.Ia();c=Io(this);Jo(c);this.o=V(document,"keydown",z(this.Hb,this));c=this.f;d=cj("player-added",this.Ia,this);hj(c,"player-ready-pubsub-key",d);this.lb&&(this.v=V(document,"click",z(this.Sb,this)));Fk(this.f);this.i.setAttribute("tabindex","0");Ko(this);this.F||P(document.body,"yt-dialog-active");Qn(Pn.C());bo(Bo.C());bo(Co.C());fj("yt-ui-dialog-show-complete",this)}};
function Lo(){var a=rd("yt-dialog");return jb(a,function(b){return Ek(b)})}
m.Ia=function(){if(!this.mb){var a=this.f;ei(document.body,"hide-players",!0);a&&ei(a,"preserve-players",!0)}};
function Io(a){var b=sd(document,"iframe",null,a.f);E(b,function(c){var d=jj(c,"onload");d&&(d=y(d))&&V(c,"load",d);if(d=jj(c,"src"))c.src=d},a);
return ob(b)}
function Jo(a){E(document.getElementsByTagName("iframe"),function(b){-1==fb(a,b)&&P(b,"iframe-hid")})}
function Mo(){var a=rd("iframe-hid");E(a,function(b){ci(b,"iframe-hid")})}
m.Nb=function(a){a=a.currentTarget;a.disabled||(a=jj(a,"action")||"",this.dismiss(a))};
m.dismiss=function(a){if(!this.ia()){this.j.M("pre-all");this.j.M("pre-"+a);Gk(this.f);bo(Bo.C());bo(Co.C());this.i.setAttribute("tabindex","-1");Lo()||(Gk(this.g),this.F||ci(document.body,"yt-dialog-active"),Ej(),Mo());this.o&&(Oj(this.o),this.o=null);this.v&&(Oj(this.v),this.v=null);var b=this.f;if(b){var c=jj(b,"player-ready-pubsub-key");c&&(ej(c),kj(b,"player-ready-pubsub-key"))}this.j.M("post-all");fj("yt-ui-dialog-hide-complete",this);"cancel"==a&&fj("yt-ui-dialog-cancelled",this);this.j&&this.j.M("post-"+
a);this.A&&this.A.focus()}};
m.setTitle=function(a){Fd(J("yt-dialog-title",this.f),a)};
m.Hb=function(a){Xi(z(function(){this.ma||27!=a.keyCode||this.dismiss("cancel")},this),0);
9==a.keyCode&&a.shiftKey&&O(document.activeElement,"yt-dialog-fg")&&a.preventDefault()};
m.Sb=function(a){"yt-dialog-base"==a.target.className&&this.dismiss("cancel")};
m.ia=function(){return this.da};
m.dispose=function(){Ek(this.f)&&this.dismiss("dispose");Oj(this.B);this.B.length=0;Xi(z(function(){this.A=null},this),0);
this.O=this.i=null;this.j.dispose();this.j=null;this.da=!0};
m.tb=function(a){a.stopPropagation();Ko(this)};
function Ko(a){Xi(z(function(){this.i&&this.i.focus()},a),0)}
A("yt.ui.Dialog",Eo);function No(){Tj.call(this,"overlay");this.j=this.g=this.i=this.f=null}
qa(No,Tj);m=No.prototype;m.register=function(){X(this,"click",this.sa,"target");X(this,"click",this.hide,"close");Oo(this)};
m.unregister=function(){Tj.prototype.unregister.call(this);Y(this,"click",this.sa,"target");Y(this,"click",this.hide,"close");this.j&&(ej(this.j),this.j=null);this.g&&(Oj(this.g),this.g=null)};
m.sa=function(a){if(!this.f||!Ek(this.f.f)){var b=this.J(a);a=Po(b,a);b||(b=a?a.overlayParentNode:null);if(b&&a){var c=!!this.l(b,"disable-shortcuts")||!1,d=!!this.l(b,"disable-outside-click-dismiss")||!1;this.f=new Eo(a,c);this.i=b;var e=J("yt-dialog-fg",a);if(e){var f=this.l(b,"overlay-class")||"",g=this.l(b,"overlay-style")||"default",h=this.l(b,"overlay-shape")||"default";f=f?f.split(" "):[];f.push(W(this,g));f.push(W(this,h));bi(e,f)}this.f.show();fj("yt-uix-kbd-nav-move-to",e||a);Oo(this);c||
d||(c=z(function(k){O(k.target,"yt-dialog-base")&&Qo(this)},this),a=J("yt-dialog-base",a),this.g=V(a,"click",c));
this.Y(b,"overlay-shown");fj("yt-uix-overlay-shown",b)}}};
function Oo(a){a.j||(a.j=cj("yt-uix-overlay-hide",Ro));a.f&&Ho(a.f,function(){var b=No.C();b.i=null;b.f.dispose();b.f=null})}
function Qo(a){if(a.f){var b=a.i;a.f.dismiss("overlayhide");b&&a.Y(b,"overlay-hidden");a.i=null;a.g&&(Oj(a.g),a.g=null);a.f=null}}
function Po(a,b){var c;if(a)if(c=J("yt-dialog",a)){var d=I("body-container");d&&(d.appendChild(c),a.overlayContentNode=c,c.overlayParentNode=a)}else c=a.overlayContentNode;else b&&(c=K(b,"yt-dialog"));return c}
function So(){var a=No.C();if(a.i)a=J("yt-dialog-fg-content",a.i.overlayContentNode);else a:{if(a=rd("yt-dialog-fg-content"))for(var b=0;b<a.length;b++){var c=K(a[b],"yt-dialog");if(Ek(c)){a=a[b];break a}}a=null}return a}
m.hide=function(a){a&&a.disabled||fj("yt-uix-overlay-hide")};
function Ro(){Qo(No.C())}
m.show=function(a){this.sa(a)};
Ja(No);var To={},Uo=[];function Vo(a){a=K(a,"yt-uix-button-subscription-container");a=J("unsubscribe-confirmation-overlay-container",a);return J("yt-dialog",a)}
function Wo(a,b){Oj(Uo);Uo.length=0;To[b]||(To[b]=Vo(a));No.C().show(To[b]);var c=So();return new de(function(d){Uo.push(Mj(c,function(){d()},"overlay-confirmation-unsubscribe-button"))})}
;function Xo(){var a=R("PLAYER_CONFIG");return a&&a.args&&void 0!==a.args.authuser?!0:!(!R("SESSION_INDEX")&&!R("LOGGED_IN"))}
;function Yo(){Tj.call(this,"subscription-button")}
qa(Yo,Tj);m=Yo.prototype;m.register=function(){X(this,"click",this.ua);Vj(this,ok,this.Xa);Vj(this,pk,this.Wa);Vj(this,qk,this.Qb);Vj(this,tk,this.Xa);Vj(this,uk,this.Wa);Vj(this,vk,this.Rb);Vj(this,xk,this.Pb);Vj(this,yk,this.Ob)};
m.unregister=function(){Y(this,"click",this.ua);Tj.prototype.unregister.call(this)};
m.isSubscribed=function(a){return!!this.l(a,"is-subscribed")};
m.ua=function(a){var b=this.l(a,"href"),c=this.l(a,"insecure");if(b)a=this.l(a,"target")||"_self",window.open(b,a);else if(!c)if(Xo()){b=this.l(a,"channel-external-id");c=this.l(a,"clicktracking");var d=Zo(this,a),e=this.l(a,"parent-url");if(this.l(a,"is-subscribed")){var f=this.l(a,"subscription-id"),g=this.l(a,"unsubscribe-params"),h=new kk(b,f,d,a,c,e,g);this.l(a,"show-unsub-confirm-dialog")?Wo(a,b).then(function(){U(sk,h)}):U(sk,h)}else a=this.l(a,"params"),U(nk,new ik(b,d,c,e,void 0,a))}else $o(this,
a)};
m.Xa=function(a){this.X(a.f,this.bb,!0)};
m.Wa=function(a){this.X(a.f,this.bb,!1)};
m.Qb=function(a){this.X(a.f,this.cb,!0,a.g)};
m.Rb=function(a){this.X(a.f,this.cb,!1)};
m.Pb=function(a){this.X(a.f,this.rb)};
m.Ob=function(a){this.X(a.f,this.qb)};
m.cb=function(a,b,c){b?(hj(a,"is-subscribed","true"),c&&hj(a,"subscription-id",c)):(kj(a,"is-subscribed"),kj(a,"subscription-id"));ap(this,a)};
function Zo(a,b){if(!a.l(b,"ypc-enabled"))return null;var c=a.l(b,"ypc-item-type"),d=a.l(b,"ypc-item-id");return{itemType:c,itemId:d,subscriptionElement:b}}
m.bb=function(a,b){var c=K(a,"yt-uix-button-subscription-container");ei(c,"yt-subscription-button-disabled-mask-container",b);a.setAttribute("aria-busy",b?"true":"false");a.disabled=b};
function ap(a,b){var c=a.l(b,"style-type"),d=!!a.l(b,"is-subscribed");c="-"+c;var e="yt-uix-button-subscribed"+c;ei(b,"yt-uix-button-subscribe"+c,!d);ei(b,e,d);a.l(b,"subscriber-count-tooltip")&&!a.l(b,"subscriber-count-show-when-subscribed")&&(c=W(Hk.C()),ei(b,c,!d),b.title=d?"":a.l(b,"subscriber-count-title"));d?Xi(function(){P(b,"hover-enabled")},1E3):ci(b,"hover-enabled")}
m.rb=function(a){var b=!!this.l(a,"ypc-item-type"),c=!!this.l(a,"ypc-item-id");!this.l(a,"ypc-enabled")&&b&&c&&(P(a,"ypc-enabled"),hj(a,"ypc-enabled","true"))};
m.qb=function(a){this.l(a,"ypc-enabled")&&(ci(a,"ypc-enabled"),kj(a,"ypc-enabled"))};
function bp(a,b){var c=rd(W(a));return gb(c,function(d){return b==this.l(d,"channel-external-id")},a)}
m.nb=function(a,b,c){var d=rb(arguments,2);E(a,function(e){b.apply(this,nb(e,d))},this)};
m.X=function(a,b,c){var d=bp(this,a);d=nb([d],rb(arguments,1));this.nb.apply(this,d)};
function $o(a,b){var c=z(function(d){d.discoverable_subscriptions&&Ri("SUBSCRIBE_EMBED_DISCOVERABLE_SUBSCRIPTIONS",d.discoverable_subscriptions);this.ua(b)},a);
Pk(c)}
Ja(Yo);function cp(a){this.f=a;this.L=null;R("SUBSCRIBE_EMBED_HOVERCARD_URL")&&(dp(this),V(this.f,"mouseover",z(this.j,this)),V(this.f,"mouseout",z(this.na,this)),V(this.f,"click",z(this.na,this)),wj(qk,Ua(this.g,!0),this),wj(vk,Ua(this.g,!1),this),ep(this))}
function dp(a){var b={url:R("SUBSCRIBE_EMBED_HOVERCARD_URL"),style:"bubble",hideClickDetection:!0,show:!1,anchor:a.f,relayOpen:"-1"};a=z(a.i,a);ek().open(b,a)}
function ep(a){Xo()||cj("LOGGED_IN",function(){this.L&&(this.na(),this.L.close(),this.L=null,dp(this))},a)}
cp.prototype.i=function(a){this.L=a;a=Yo.C().isSubscribed(this.f);this.g(a)};
cp.prototype.j=function(){this.L&&this.L.restyle({show:!0})};
cp.prototype.na=function(){this.L&&this.L.restyle({show:!1})};
cp.prototype.g=function(a){if(this.L){a={isSubscribed:a};try{this.L.send("msg-hovercard-subscription",a,void 0,y("gapi.iframes.SAME_ORIGIN_IFRAMES_FILTER"))}catch(b){}}};function fp(){dk(function(){var a=jg(I("yt-subscribe"));a={width:a.width,height:a.height};var b=gp;ek().ready(a,null,b)})}
function gp(a){if(a.length&&a[a.length-1]){a=a[a.length-1].eurl;var b=I("yt-subscribe"),c=Yo.C();if(b=J(W(c),b))a&&(Yo.C(),hj(b,"parent-url",a)),new cp(b)}}
;function hp(a,b){var c=void 0===c?{}:c;var d=tn;R("ytLoggingEventsDefaultDisabled",!1)&&tn==tn&&(d=null);ql(a,b,d,c)}
;var ip=y("ytglobal.prefsUserPrefsPrefs_")||{};A("ytglobal.prefsUserPrefsPrefs_",ip);function jp(){this.f=R("ALT_PREF_COOKIE_NAME","PREF");var a=Rl(this.f);if(a){a=decodeURIComponent(a).split("&");for(var b=0;b<a.length;b++){var c=a[b].split("="),d=c[0];(c=c[1])&&(ip[d]=c.toString())}}}
m=jp.prototype;m.get=function(a,b){kp(a);lp(a);var c=mp(a);return null!=c?c:b?b:""};
m.set=function(a,b){kp(a);lp(a);if(null==b)throw Error("ExpectedNotNull");ip[a]=b.toString()};
function np(a){var b=mp("f"+(Math.floor(a/31)+1));return!!(((null!=b&&/^[A-Fa-f0-9]+$/.test(b)?parseInt(b,16):null)||0)&1<<a%31)}
m.remove=function(a){kp(a);lp(a);delete ip[a]};
m.save=function(){Ql(this.f,this.dump(),63072E3)};
m.clear=function(){for(var a in ip)delete ip[a]};
m.dump=function(){var a=[],b;for(b in ip)a.push(b+"="+encodeURIComponent(String(ip[b])));return a.join("&")};
function lp(a){if(/^f([1-9][0-9]*)$/.test(a))throw Error("ExpectedRegexMatch: "+a);}
function kp(a){if(!/^\w+$/.test(a))throw Error("ExpectedRegexMismatch: "+a);}
function mp(a){return void 0!==ip[a]?ip[a].toString():null}
Ja(jp);var op=new Map([["dark","USER_INTERFACE_THEME_DARK"],["light","USER_INTERFACE_THEME_LIGHT"]]),pp=["/fashion","/channel/UCrpQ4p1Ql_hG8rKXIKM1MOQ","/channel/UCTApTkbpcqiLL39WUlne4ig","/channel/UCW5PCzG3KQvbOX4zc3KY0lQ"];function qp(){var a=void 0===a?window.location.href:a;if(Z("kevlar_disable_theme_param"))return null;var b=Bf(Cf(5,a));if(rp(b))return"USER_INTERFACE_THEME_DARK";a=ak(a).theme;return op.get(a)||null}
function rp(a){var b=pp.map(function(c){return c.toLowerCase()});
return!Z("disable_dark_fashion_destination_launch")&&b.some(function(c){return a.toLowerCase().startsWith(c)})?!0:!1}
;function sp(){this.f={};var a=Rl("CONSISTENCY");a&&tp(this,{encryptedTokenJarContents:a})}
sp.prototype.g=function(a,b){var c,d,e,f=null===(d=null===(c=b.context)||void 0===c?void 0:c.request)||void 0===d?void 0:d.consistencyTokenJars,g=null===(e=a.responseContext)||void 0===e?void 0:e.consistencyTokenJar;f&&g&&this.replace(f,g)};
sp.prototype.replace=function(a,b){for(var c=v(a),d=c.next();!d.done;d=c.next())delete this.f[d.value.encryptedTokenJarContents];tp(this,b)};
function tp(a,b){if(b.encryptedTokenJarContents&&(a.f[b.encryptedTokenJarContents]=b,"string"===typeof b.expirationSeconds)){var c=Number(b.expirationSeconds);setTimeout(function(){delete a.f[b.encryptedTokenJarContents]},1E3*c);
Ql("CONSISTENCY",b.encryptedTokenJarContents,c,void 0,!0)}}
;function up(){var a=R("LOCATION_PLAYABILITY_TOKEN");a&&(this.locationPlayabilityToken=a,this.f=void 0)}
function vp(){up.f||(up.f=new up);return up.f}
up.prototype.g=function(a){var b;a=null===(b=a.responseContext)||void 0===b?void 0:b.locationPlayabilityToken;void 0!==a&&(this.locationPlayabilityToken=a,this.f=void 0)};var wp={bluetooth:"CONN_DISCO",cellular:"CONN_CELLULAR_UNKNOWN",ethernet:"CONN_WIFI",none:"CONN_NONE",wifi:"CONN_WIFI",wimax:"CONN_CELLULAR_4G",other:"CONN_UNKNOWN",unknown:"CONN_UNKNOWN","slow-2g":"CONN_CELLULAR_2G","2g":"CONN_CELLULAR_2G","3g":"CONN_CELLULAR_3G","4g":"CONN_CELLULAR_4G"};var xp=[{Na:function(a){return"Cannot read property '"+a.key+"'"},
ra:{TypeError:[{regexp:/Cannot read property '([^']+)' of (null|undefined)/,groups:["key","value"]},{regexp:/\u65e0\u6cd5\u83b7\u53d6\u672a\u5b9a\u4e49\u6216 (null|undefined) \u5f15\u7528\u7684\u5c5e\u6027\u201c([^\u201d]+)\u201d/,groups:["value","key"]},{regexp:/\uc815\uc758\ub418\uc9c0 \uc54a\uc74c \ub610\ub294 (null|undefined) \ucc38\uc870\uc778 '([^']+)' \uc18d\uc131\uc744 \uac00\uc838\uc62c \uc218 \uc5c6\uc2b5\ub2c8\ub2e4./,groups:["value","key"]},{regexp:/No se puede obtener la propiedad '([^']+)' de referencia nula o sin definir/,
groups:["key"]},{regexp:/Unable to get property '([^']+)' of (undefined or null) reference/,groups:["key","value"]}],Error:[{regexp:/(Permission denied) to access property "([^']+)"/,groups:["reason","key"]}]}},{Na:function(a){return"Cannot call '"+a.key+"'"},
ra:{TypeError:[{regexp:/(?:([^ ]+)?\.)?([^ ]+) is not a function/,groups:["base","key"]},{regexp:/Object (.*) has no method '([^ ]+)'/,groups:["base","key"]},{regexp:/Object doesn't support property or method '([^ ]+)'/,groups:["key"]},{regexp:/\u30aa\u30d6\u30b8\u30a7\u30af\u30c8\u306f '([^']+)' \u30d7\u30ed\u30d1\u30c6\u30a3\u307e\u305f\u306f\u30e1\u30bd\u30c3\u30c9\u3092\u30b5\u30dd\u30fc\u30c8\u3057\u3066\u3044\u307e\u305b\u3093/,groups:["key"]},{regexp:/\uac1c\uccb4\uac00 '([^']+)' \uc18d\uc131\uc774\ub098 \uba54\uc11c\ub4dc\ub97c \uc9c0\uc6d0\ud558\uc9c0 \uc54a\uc2b5\ub2c8\ub2e4./,
groups:["key"]}]}}];function yp(){this.f=[];this.g=[]}
var zp;var Ap=new Q;var Bp=new Set,Cp=0,Dp=["PhantomJS","Googlebot","TO STOP THIS SECURITY SCAN go/scan"];function Ep(a){Fp(a)}
function Fp(a,b){var c=void 0===c?{}:c;c.name=R("INNERTUBE_CONTEXT_CLIENT_NAME",1);c.version=R("INNERTUBE_CONTEXT_CLIENT_VERSION",void 0);var d=c||{};c=void 0===b?"ERROR":b;c=void 0===c?"ERROR":c;var e=void 0===e?!1:e;if(a){if(Z("console_log_js_exceptions")){var f=[];f.push("Name: "+a.name);f.push("Message: "+a.message);a.hasOwnProperty("params")&&f.push("Error Params: "+JSON.stringify(a.params));f.push("File name: "+a.fileName);f.push("Stacktrace: "+a.stack);window.console.log(f.join("\n"),a)}if((window&&
window.yterr||e)&&!(5<=Cp)&&0!==a.sampleWeight){var g=Ac(a);e=g.message||"Unknown Error";f=g.name||"UnknownError";var h=g.lineNumber||"Not available",k=g.fileName||"Not available";g=g.stack||a.f||"Not available";if(a.hasOwnProperty("args")&&a.args&&a.args.length)for(var l=0,n=0;n<a.args.length;n++){var p=a.args[n],q="params."+n;l+=q.length;if(p)if(Array.isArray(p))for(var r=d,u=0;u<p.length&&!(p[u]&&(l+=Gp(u,p[u],q,r),500<l));u++);else if("object"===typeof p)for(r in r=void 0,u=d,p){if(p[r]&&(l+=
Gp(r,p[r],q,u),500<l))break}else d[q]=String(JSON.stringify(p)).substring(0,500),l+=d[q].length;else d[q]=String(JSON.stringify(p)).substring(0,500),l+=d[q].length;if(500<=l)break}else if(a.hasOwnProperty("params")&&a.params)if(p=a.params,"object"===typeof a.params)for(n in q=0,p){if(p[n]&&(l="params."+n,r=String(JSON.stringify(p[n])).substr(0,500),d[l]=r,q+=l.length+r.length,500<q))break}else d.params=String(JSON.stringify(p)).substr(0,500);navigator.vendor&&!d.hasOwnProperty("vendor")&&(d.vendor=
navigator.vendor);d={message:e,name:f,lineNumber:h,fileName:k,stack:g,params:d};e=Number(a.columnNumber);isNaN(e)||(d.lineNumber=d.lineNumber+":"+e);e=v(xp);for(f=e.next();!f.done;f=e.next())if(f=f.value,f.ra[d.name])for(k=v(f.ra[d.name]),h=k.next();!h.done;h=k.next())if(g=h.value,h=d.message.match(g.regexp)){d.params["error.original"]=h[0];k=g.groups;g={};for(n=0;n<k.length;n++)g[k[n]]=h[n+1],d.params["error."+k[n]]=h[n+1];d.message=f.Na(g);break}window.yterr&&"function"===typeof window.yterr&&window.yterr(d);
if(!(Bp.has(d.message)||0<=d.stack.indexOf("/YouTubeCenter.js")||0<=d.stack.indexOf("/mytube.js"))){Ap.M("handleError",d);if(Z("kevlar_gel_error_routing")){e=c;a:{f=v(Dp);for(h=f.next();!h.done;h=f.next())if((k=wb)&&0<=k.toLowerCase().indexOf(h.value.toLowerCase())){f=!0;break a}f=!1}if(!f){f={stackTrace:d.stack};d.fileName&&(f.filename=d.fileName);h=d.lineNumber&&d.lineNumber.split?d.lineNumber.split(":"):[];0!==h.length&&(1!==h.length||isNaN(Number(h[0]))?2!==h.length||isNaN(Number(h[0]))||isNaN(Number(h[1]))||
(f.lineNumber=Number(h[0]),f.columnNumber=Number(h[1])):f.lineNumber=Number(h[0]));h=d.message;k=d.name;zp||(zp=new yp);g=zp;a:{n=v(g.g);for(p=n.next();!p.done;p=n.next())if(p=p.value,d.message&&d.message.match(p.f)){g=p.weight;break a}g=v(g.f);for(n=g.next();!n.done;n=g.next())if(n=n.value,n.f(d)){g=n.weight;break a}g=1}h={level:"ERROR_LEVEL_UNKNOWN",message:h,errorClassName:k,sampleWeight:g};"ERROR"===e?h.level="ERROR_LEVEL_ERROR":"WARNING"===e&&(h.level="ERROR_LEVEL_WARNNING");e={isObfuscated:!0,
browserStackInfo:f};f={pageUrl:window.location.href,kvPairs:[]};if(k=d.params)for(g=v(Object.keys(k)),n=g.next();!n.done;n=g.next())n=n.value,f.kvPairs.push({key:"client."+n,value:String(k[n])});k=R("SERVER_NAME",void 0);g=R("SERVER_VERSION",void 0);k&&g&&(f.kvPairs.push({key:"server.name",value:k}),f.kvPairs.push({key:"server.version",value:g}));hp("clientError",{errorMetadata:f,stackTrace:e,logMessage:h});hl()}}e=d.params||{};c={ta:{a:"logerror",t:"jserror",type:d.name,msg:d.message.substr(0,250),
line:d.lineNumber,level:c,"client.name":e.name},G:{url:R("PAGE_NAME",window.location.href),file:d.fileName},method:"POST"};e.version&&(c["client.version"]=e.version);if(c.G){d.stack&&(c.G.stack=d.stack);f=v(Object.keys(e));for(h=f.next();!h.done;h=f.next())h=h.value,c.G["client."+h]=e[h];if(e=R("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS",void 0))for(f=v(Object.keys(e)),h=f.next();!h.done;h=f.next())h=h.value,c.G[h]=e[h];e=R("SERVER_NAME",void 0);f=R("SERVER_VERSION",void 0);e&&f&&(c.G["server.name"]=
e,c.G["server.version"]=f)}Fl(R("ECATCHER_REPORT_HOST","")+"/error_204",c);Bp.add(d.message);Cp++}}}}
function Gp(a,b,c,d){c+="."+a;a=String(JSON.stringify(b)).substr(0,500);d[c]=a;return c.length+a.length}
;function Hp(a,b,c,d){this.f=a;this.o=b;this.i=Ep;this.g=c;this.j=d}
function Ip(a,b,c){Jp.f||(Jp.f=new Jp);var d=Jp.f;Yl.f||(Yl.f=new Yl);Hp.f=new Hp(a,d,b,c)}
function Kp(a){if(!Lp){var b={Ca:{playlistEditEndpoint:Mp,subscribeEndpoint:Np,unsubscribeEndpoint:Op,modifyChannelNotificationPreferenceEndpoint:Pp}};var c=Z("web_enable_client_location_service")?vp():void 0;if(Z("web_response_processor_support")){var d=[];c&&d.push(c);Ip(b,void 0,d)}else Ip(b,c);Lp=Hp.f}b=Lp;var e=void 0===e?$l:e;a:{var f,g;if((null===(f=a.signalServiceEndpoint)||void 0===f?0:f.signal)&&b.f.Ub&&(f=b.f.Ub[a.signalServiceEndpoint.signal])){var h=new f;break a}if((null===(g=a.continuationCommand)||
void 0===g?0:g.request)&&b.f.ob&&(g=b.f.ob[a.continuationCommand.request])){h=new g;break a}for(h in a)if(b.f.Ca[h]&&(g=b.f.Ca[h])){h=new g;break a}h=void 0}if(!h)return b.i(new sn("Error: No request builder found for command.",a)),ie({});g=void 0;g=void 0===g?{}:g;f=a.clickTrackingParams;var k=void 0===k?!0:k;if(c=R("INNERTUBE_CONTEXT")){c=Eb(c);c.client||(c.client={});d=c.client;"MWEB"===d.clientName&&(d.clientFormFactor=R("IS_TABLET")?"LARGE_FORM_FACTOR":"SMALL_FORM_FACTOR");d.screenWidthPoints=
window.innerWidth;d.screenHeightPoints=window.innerHeight;d.screenPixelDensity=Math.round(window.devicePixelRatio)||1;d.utcOffsetMinutes=-Math.floor((new Date).getTimezoneOffset());var l=void 0===l?!1:l;jp.C();var n=np(165)?"USER_INTERFACE_THEME_DARK":"USER_INTERFACE_THEME_LIGHT";Z("kevlar_apply_prefers_color_theme")&&(n=np(165)?"USER_INTERFACE_THEME_DARK":np(174)?"USER_INTERFACE_THEME_LIGHT":window.matchMedia&&window.matchMedia("(prefers-color-scheme)").matches&&window.matchMedia("(prefers-color-scheme: dark)").matches?
"USER_INTERFACE_THEME_DARK":"USER_INTERFACE_THEME_LIGHT");l=l?n:qp()||n;d.userInterfaceTheme=l;if(Z("web_log_connection")){c:{if(n=(l=window.navigator)?l.connection:void 0){l=wp[n.type||"unknown"]||"CONN_UNKNOWN";n=wp[n.f||"unknown"]||"CONN_UNKNOWN";"CONN_CELLULAR_UNKNOWN"===l&&"CONN_UNKNOWN"!==n&&(l=n);if("CONN_UNKNOWN"!==l)break c;if("CONN_UNKNOWN"!==n){l=n;break c}}l=void 0}l&&(d.connectionType=l)}(l=Rl("EXPERIMENTS_DEBUG"))?d.experimentsToken="ZERO"===l?"GgIQAQ%3D%3D":l:delete d.experimentsToken;
l=Tk();sp.f||(sp.f=new sp);d=Ab(sp.f.f);c.request=Object.assign(Object.assign({},c.request),{internalExperimentFlags:l,consistencyTokenJars:d});d=jp.C();l=np(58);d=d.get("gsml","");c.user=Object.assign({},c.user);l&&(c.user.enableSafetyMode=l);d&&(c.user.lockedSafetyMode=!0);(l=R("DELEGATED_SESSION_ID"))&&!Z("pageid_as_header_web")&&(c.user.onBehalfOfUser=l);k&&(k=Nn())&&(c.clientScreenNonce=k);f&&(c.clickTracking={clickTrackingParams:f});Z("web_enable_client_location_service")&&(k=vp(),c.client||
(c.client={}),k.f?(c.client.locationInfo||(c.client.locationInfo={}),c.client.locationInfo.latitudeE7=1E7*k.f.coords.latitude,c.client.locationInfo.longitudeE7=1E7*k.f.coords.longitude,c.client.locationInfo.horizontalAccuracyMeters=k.f.coords.accuracy):k.locationPlayabilityToken&&(c.client.locationPlayabilityToken=k.locationPlayabilityToken));k=c}else Fp(Error("Error: No InnerTubeContext shell provided in ytconfig.")),k={};k={context:k};(f=h.i(a))?h.f(k,f,g):(Fp(new sn("Error: Failed to create Request from Command.",
a)),k=void 0);if(!k)return b.i(new sn("Error: Failed to build request for command.",a)),ie({});g=Qp("/youtubei/v1/"+Rp(h.g()));var p;var q=(a=null===(p=null===(q=a.commandMetadata)||void 0===q?void 0:q.webCommandMetadata)||void 0===p?void 0:p.apiUrl)?Qp(a):void 0;q&&(g=q);return Sp(b,k,g,e,h.j())}
function Sp(a,b,c,d,e){d=void 0===d?$l:d;var f=JSON.stringify(b),g=ck(c)?"same-origin":"cors",h=ck(c)?"same-origin":"include";return Tp().then(function(k){k={method:"POST",mode:g,credentials:h,headers:k,body:f};var l;e&&(l=Object.assign({zc:c,Ac:k,identity:d,requestTime:Vk(),Bc:0},e));return a.o.fetch(c,k,l)}).then(function(k){if(a.j)for(var l=v(a.j),n=l.next();!n.done;n=l.next())n.value.g(k,b);
else a.g&&a.g.g(k);return ie(k)})}
function Qp(a){var b=bk(a,{key:R("INNERTUBE_API_KEY")},!1);if(a=R("INNERTUBE_HOST_OVERRIDE")){a=String(a);var c=String,d=b.match(Af);b=d[5];var e=d[6];d=d[7];var f="";b&&(f+=b);e&&(f+="?"+e);d&&(f+="#"+d);b=a+c(f)}return b}
function Tp(){return ie(Zl()).then(function(a){a=Object.assign({"Content-Type":"application/json","X-Goog-Visitor-Id":R("VISITOR_DATA")},a);return ie(a)})}
;var Up=["notification/modify_channel_preference"],Vp=["browse/edit_playlist"],Wp=["subscription/subscribe"],Xp=["subscription/unsubscribe"];var Yp={},Zp=(Yp.WEB_UNPLUGGED="^unplugged/",Yp.WEB_UNPLUGGED_ONBOARDING="^unplugged/",Yp.WEB_UNPLUGGED_OPS="^unplugged/",Yp.WEB_UNPLUGGED_PUBLIC="^unplugged/",Yp.WEB_CREATOR="^creator/",Yp.WEB_KIDS="^kids/",Yp.WEB_EXPERIMENTS="^experiments/",Yp.WEB_MUSIC="^music/",Yp.WEB_REMIX="^music/",Yp.WEB_MUSIC_EMBEDDED_PLAYER="^music/",Yp.WEB_MUSIC_EMBEDDED_PLAYER="^main_app/|^sfv/",Yp);
function Rp(a){var b=void 0===b?"UNKNOWN_INTERFACE":b;if(1===a.length)return a[0];var c=Zp[b];if(c){var d=new RegExp(c),e=v(a);for(c=e.next();!c.done;c=e.next())if(c=c.value,d.exec(c))return c}var f=[];Object.entries(Zp).forEach(function(g){var h=v(g);g=h.next().value;h=h.next().value;b!==g&&f.push(h)});
d=new RegExp(f.join("|"));a.sort(function(g,h){return g.length-h.length});
e=v(a);for(c=e.next();!c.done;c=e.next())if(c=c.value,!d.exec(c))return c;return a[0]}
;function $p(){}
$p.prototype.j=function(){};function Np(){}
qa(Np,$p);Np.prototype.g=function(){return Wp};
Np.prototype.j=function(){return{}};
Np.prototype.i=function(a){return a.subscribeEndpoint};
Np.prototype.f=function(a,b,c){c=void 0===c?{}:c;b.channelIds&&(a.channelIds=b.channelIds);b.siloName&&(a.siloName=b.siloName);b.params&&(a.params=b.params);c.botguardResponse&&(a.botguardResponse=c.botguardResponse);c.feature&&(a.clientFeature=c.feature)};function Op(){}
qa(Op,$p);Op.prototype.g=function(){return Xp};
Op.prototype.j=function(){return{}};
Op.prototype.i=function(a){return a.unsubscribeEndpoint};
Op.prototype.f=function(a,b){b.channelIds&&(a.channelIds=b.channelIds);b.siloName&&(a.siloName=b.siloName);b.params&&(a.params=b.params)};function Pp(){}
qa(Pp,$p);Pp.prototype.g=function(){return Up};
Pp.prototype.i=function(a){return a.modifyChannelNotificationPreferenceEndpoint};
Pp.prototype.f=function(a,b){b.params&&(a.params=b.params);b.secondaryParams&&(a.secondaryParams=b.secondaryParams)};function Mp(){}
qa(Mp,$p);Mp.prototype.g=function(){return Vp};
Mp.prototype.i=function(a){return a.playlistEditEndpoint};
Mp.prototype.f=function(a,b){b.actions&&(a.actions=b.actions);b.params&&(a.params=b.params);b.playlistId&&(a.playlistId=b.playlistId)};function ze(){}
ze.prototype.flush=function(a){a=void 0===a?[]:a;if(Z("enable_client_streamz_web")){a=v(a);for(var b=a.next();!b.done;b=a.next()){b=b.value;var c=new wh;c=pf(c,1,b.j);for(var d=b,e=[],f=0;f<d.f.length;f++)e.push(d.f[f].T);c=pf(c,3,e||[]);d=[];e=[];f=v(b.Z.keys());for(var g=f.next();!g.done;g=f.next())e.push(g.value.split(","));for(f=0;f<e.length;f++){g=e[f];var h=b.g;for(var k=b.Ea(g)||[],l=[],n=0;n<k.length;n++){var p=k[n];p=p&&p.ya;var q=new Gh;switch(h){case 3:qf(q,1,Hh[0],Number(p));break;case 2:qf(q,
2,Hh[0],Number(p))}l.push(q)}h=l;for(k=0;k<h.length;k++){n=h[k];l=new Ch;l.f||(l.f={});p=n?uf(n):n;l.f[2]=n;l=pf(l,2,p);n=g;p=[];q=b;for(var r=[],u=0;u<q.f.length;u++)r.push(q.f[u].U);q=r;for(r=0;r<q.length;r++){u=q[r];var B=n[r],C=new Eh;switch(u){case 3:qf(C,1,Fh[0],String(B));break;case 2:qf(C,2,Fh[0],Number(B));break;case 1:qf(C,3,Fh[0],"true"==B)}p.push(C)}tf(l,1,p);d.push(l)}}tf(c,4,d);d=b=new $e;e=L(c,1);null!=e&&ff(d,1,e);e=L(c,5);null!=e&&df(d,5,e);e=rf(c,yh,2);null!=e&&gf(d,2,e,Ih);e=L(c,
3);if(0<e.length&&null!=e)for(f=0;f<e.length;f++)ff(d,3,e[f]);e=L(c,6);if(0<e.length&&null!=e)for(f=0;f<e.length;f++)df(d,6,e[f]);e=sf(c,Ch,4);0<e.length&&hf(d,4,e,Lh);c=new Uint8Array(b.g+b.f.length());e=b.i;f=e.length;for(g=d=0;g<f;g++)h=e[g],c.set(h,d),d+=h.length;e=b.f.end();c.set(e,d);b.i=[c];b={serializedIncrementBatch:Ze(c)};hp("streamzIncremented",b)}}};var aq;function Ce(){if(!aq){aq=new ye;var a=Sk("client_streamz_web_flush_count",-1);-1!==a&&(aq.v=a)}return aq}
;function Jp(){this.j=new Be;this.g=new De;this.i=new Fe;this.f=new Ge}
Jp.prototype.fetch=function(a,b){var c=this,d=new Request(a,b),e=Bf(Cf(5,Nf(d.url)));this.j.f.j("/client_streamz/youtube/web/network/one_platform_requests",e);return ie(fetch(d).then(function(f){return bq(c,f,e)})["catch"](function(f){Fp(f,"WARNING")}))};
function bq(a,b,c){var d=b.json();b.redirected?Ee(a.g,b.status,c,Bf(Cf(5,b.url))):b.ok?a.i.f.j("/client_streamz/youtube/web/network/one_platform_request_success",c):(a.f.f.j("/client_streamz/youtube/web/network/one_platform_request_failed",b.status,c),d.then(function(e){Fp(new sn("Error: API fetch failed",b.status,b.url,e),"WARNING")}));
return d}
;var Lp;function cq(a){S.call(this,1,arguments)}
D(cq,S);function dq(a,b){S.call(this,2,arguments);this.g=a;this.f=b}
D(dq,S);function eq(a,b,c,d){S.call(this,1,arguments);this.f=b;this.itemType=c||null;this.itemId=d||null}
D(eq,S);function fq(a,b){S.call(this,1,arguments);this.g=a;this.f=b||null}
D(fq,S);function gq(a){S.call(this,1,arguments)}
D(gq,S);var hq=new T("ypc-core-load",cq),iq=new T("ypc-guide-sync-success",dq),jq=new T("ypc-purchase-success",eq),kq=new T("ypc-subscription-cancel",gq),lq=new T("ypc-subscription-cancel-success",fq),mq=new T("ypc-init-subscription",gq);var nq=[];function oq(a){a.g?U(hq,new cq(function(){U(mq,new gq(a.g))})):Z("web_classic_innertube_subscription_update")?pq(a.f,a.params):qq(a.f,a.j,a.i,a.source,a.params)}
function rq(a){a.g?U(hq,new cq(function(){U(kq,new gq(a.g))})):Z("web_classic_innertube_subscription_update")?sq(a.f,a.params):tq(a.f,a.o,a.j,a.i,a.source)}
function uq(a){vq(ob(a.f))}
function wq(a){xq(ob(a.f))}
function yq(a){zq(a.i,a.g,a.f)}
function Aq(a){var b=a.itemId,c=a.f.subscriptionId;b&&c&&U(qk,new jk(b,c,a.f.channelInfo))}
function Bq(a){var b=a.f;zb(a.g,function(c,d){U(qk,new jk(d,c,b[d]))})}
function Cq(a){U(vk,new gk(a.g.itemId));a.f&&a.f.length&&(Dq(a.f,vk),Dq(a.f,xk))}
function pq(a,b){var c=new gk(a);U(ok,c);le(Kp({commandMetadata:{webCommandMetadata:{apiUrl:"/youtubei/v1/subscription/subscribe"}},subscribeEndpoint:{channelIds:[a],params:b}}).then(function(){U(qk,new jk(a,Math.round(1E4*Math.random()).toString(),{thumbnail:"",title:"",url:"",wc:a}))}),function(){U(pk,c)})}
function qq(a,b,c,d,e){var f=new gk(a);U(ok,f);var g={};g.c=a;c&&(g.eurl=c);d&&(g.source=d);c={};(d=R("PLAYBACK_ID"))&&(c.plid=d);(d=R("EVENT_ID"))&&(c.ei=d);e&&(c.params=e);b&&Eq(b,c);Fl("/subscription_ajax?action_create_subscription_to_channel=1",{method:"POST",ta:g,G:c,onSuccess:function(h,k){var l=k.response;U(qk,new jk(a,l.id,l.channel_info));l.show_feed_privacy_dialog&&fj("SHOW-FEED-PRIVACY-SUBSCRIBE-DIALOG",a)},
ca:function(){U(pk,f)}})}
function sq(a,b){var c=new gk(a);U(tk,c);le(Kp({commandMetadata:{webCommandMetadata:{apiUrl:"/youtubei/v1/subscription/unsubscribe"}},unsubscribeEndpoint:{channelIds:[a],params:b}}).then(function(){U(vk,c)}),function(){U(uk,c)})}
function tq(a,b,c,d,e){var f=new gk(a);U(tk,f);var g={};g.c=a;d&&(g.eurl=d);e&&(g.source=e);d={};d.c=a;d.s=b;(a=R("PLAYBACK_ID"))&&(d.plid=a);(a=R("EVENT_ID"))&&(d.ei=a);c&&Eq(c,d);Fl("/subscription_ajax?action_remove_subscriptions=1",{method:"POST",ta:g,G:d,onSuccess:function(){U(vk,f)},
ca:function(){U(uk,f)}})}
function zq(a,b,c){if(a){var d={};d.channel_id=a;switch(b){case "receive-all-updates":d.receive_all_updates=!0;break;case "receive-no-updates":d.receive_no_updates=!0;d.receive_post_updates=!1;break;case "receive-highlight-updates":d.receive_all_updates=!1;d.receive_no_updates=!1;break;default:return}null===c||d.receive_no_updates||(d.receive_post_updates=c);var e=new hk(a,b,c);Fl("/subscription_ajax?action_update_subscription_preferences=1",{method:"POST",G:d,onError:function(){U(Bk,e)},
onSuccess:function(){U(Ak,e)}})}}
function vq(a){if(a.length){var b=qb(a,0,40);U("subscription-batch-subscribe-loading");Dq(b,ok);var c={};c.a=b.join(",");var d=function(){U("subscription-batch-subscribe-loaded");Dq(b,pk)};
Fl("/subscription_ajax?action_create_subscription_to_all=1",{method:"POST",G:c,onSuccess:function(e,f){d();var g=f.response,h=g.id;if(Array.isArray(h)&&h.length==b.length){var k=g.channel_info_map;E(h,function(l,n){var p=b[n];U(qk,new jk(p,l,k[p]))});
a.length?vq(a):U("subscription-batch-subscribe-finished")}},
onError:function(){d();U("subscription-batch-subscribe-failure")}})}}
function xq(a){if(a.length){var b=qb(a,0,40);U("subscription-batch-unsubscribe-loading");Dq(b,tk);var c={};c.c=b.join(",");var d=function(){U("subscription-batch-unsubscribe-loaded");Dq(b,uk)};
Fl("/subscription_ajax?action_remove_subscriptions=1",{method:"POST",G:c,onSuccess:function(){d();Dq(b,vk);a.length&&xq(a)},
onError:function(){d()}})}}
function Dq(a,b){E(a,function(c){U(b,new gk(c))})}
function Eq(a,b){var c=Zj(a),d;for(d in c)b[d]=c[d]}
;A("yt.setConfig",Ri);A("yt.config.set",Ri);A("ytbin.www.subscribeembed.init",function(){var a=!0;nq.push(wj(nk,oq),wj(sk,rq));a||nq.push(wj(rk,oq),wj(wk,rq),wj(lk,uq),wj(mk,wq),wj(zk,yq),wj(jq,Aq),wj(lq,Cq),wj(iq,Bq));a=Yo.C();var b=W(a);b in Xj||(a.register(),Uj(a,"yt-uix-init-"+b,a.init),Uj(a,"yt-uix-dispose-"+b,a.dispose),Xj[b]=a);fp()});}).call(this);
