public class JZ2 {
    /**
     *
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.
     * 则经过替换之后的字符串为 We%20Are%20Happy。
     *
     * */

    public String replaceSpace (String s) {
//        return s.replaceAll(" ","%20");

        StringBuffer str = new StringBuffer(s);
        int index = str.indexOf(" ");
        while(index != -1){
            str.deleteCharAt(index);
            str.insert(index,"%20");
            index = str.indexOf(" ");
        }
        return str.toString();
    }
}
