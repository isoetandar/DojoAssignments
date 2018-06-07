public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String trimStr1 = str1.trim();
        String trimStr2 = str2.trim();
        String concaStr = trimStr1.concat(trimStr2);
        return concaStr;
    }

    public Integer getIndexOrNull(String strIndex, char ch){
        int charIndex = strIndex.indexOf(ch);
        if (charIndex < 0){
            return null;
        }
        else {
            return charIndex;
        }
    }

    public Integer getIndexOrNull(String strIndex1, String strIndex2){
        int charIndexStr = strIndex1.indexOf(strIndex2);
        if (charIndexStr < 0){
            return null;
        }
        else {
            return charIndexStr;
        }
    }

    public String concatSubstring(String subStr1, int num1, int num2, String str2){
        String subConcatenate = subStr1.substring(num1, num2) + str2;
        
        
        return subConcatenate;
    }
}