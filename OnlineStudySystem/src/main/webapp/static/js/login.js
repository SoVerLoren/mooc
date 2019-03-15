  function addfavorite() {
    try {
        window.external.addFavorite(window.location,document.title);
    }
    catch (e) {
        try {
            window.sidebar.addPanel(window.location, document.title, "");
        }
        catch (e) {
            alert("请按 Ctrl + D 键为你的浏览器添加收藏书签。");
        }
    }
}
var _edc = _edc || [];
var edcUid = '';
if(!edcUid.length){
  edcUid = ""
}
var edc_cookie = ['UM_distinctid='+getCookie('UM_distinctid'),'_INVITECODE_NEW='+getCookie('_INVITECODE_NEW'),'etsessionid='+getCookie('etsessionid'),'_USERID'+getCookie('_USERID')];
_edc.push(['setUserId', edcUid]);//设置用户名
_edc.push(['setCustomVariable',1,"type","page_view","visit"]);
_edc.push(['setCustomVariable',3,"cookie",edc_cookie,"visit"]);
_edc.push(['enableLinkTracking']);//记录外链和下载
_edc.push(['trackPageView']);
(function() {
  var u="https://st.jd100.com/st/pv0.gif";
  _edc.push(['setTrackerUrl', u]);
  _edc.push(['setSiteId', '1']);
  var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
  g.type='text/javascript'; g.async=true; g.defer=true; g.src='https://vip.jd100.com/js/libs/edc.js'; s.parentNode.insertBefore(g,s);
})();
function getCookie(name) {
  var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
  if(arr=document.cookie.match(reg))
    return unescape(arr[2]);
  else
    return '';
}
window.onerror = function(msg,url,line,col,error){
    //没有URL不上报！上报也不知道错误
    if (!url && !line && !col){
        return true;
    }
    //采用异步的方式
    setTimeout(function(){
        var data = [];
        //不一定所有浏览器都支持col参数
        col = col || (window.event && window.event.errorCharacter) || 0;
        data[0] = 'url=' + url;
        data[1] = 'line=' + line;
        data[2] = 'col=' + col;
        if (!!error && !!error.stack){
            //如果浏览器有堆栈信息
            //直接使用
            data[3] = 'msg=' + error.stack.toString();
        }else if (!!arguments.callee){
            //尝试通过callee拿堆栈信息
            var ext = [];
            var f = arguments.callee.caller, c = 3;
            //这里只拿三层堆栈信息
            while (f && (--c>0)) {
                ext.push(f.toString());
                if (f  === f.caller) {
                    break;//如果有环
                }
                f = f.caller;
            }
            ext = ext.join(",");
            data[3] = 'msg=' + ext;
        }
        _edc.push(['setCustomVariable',4,"scriptError",data,"visit"]);
        _edc.push(['trackPageView']);
    },0);
    return true;
};