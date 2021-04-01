package the.wuxjian.solution.ch03;

/**
 * 题目描述： 将一个字符串中的空格替换成“%20”。 例如： 当字符串为 We Are
 * Happy.则经过替换之后的字符串为 We%20Are%20Happy。
 * Created by wuxjian on 2021/4/1
 */
public class ReplaceSpace {
    public static String replaceSpace(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }
}
