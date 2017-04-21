/*判断字符串是否为空   为空返回true 否则返回false*/
function isNull(arg1){
	return !arg1 && arg1!==0 && typeof arg1!=="boolean"?true:false;
}
