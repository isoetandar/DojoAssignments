myStr = "Turtles are Greasy"

function RevStr(str){
    newStr="";
    for (var i=str.length-1;i>=0;i--){
        newStr+=Str[i];
    }
    return newStr;
}

console.log(RevStr(myStr));