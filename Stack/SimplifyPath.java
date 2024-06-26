package Striver.Stack;
//71.[Medium] Simplify Path
//TODO
public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        String[] paths = path.split("/");
       int left = -1, right = 0;
       while (right < paths.length) {
           if (paths[right].equals(".."))
               left = left == -1 ? -1 : left - 1;
           else if (!paths[right].equals(".") && !paths[right].equals(""))
               paths[++left] = paths[right];
           right++;
       }
       if (left == -1)
           return "/";
       StringBuilder buf = new StringBuilder();
       for (int i = 0; i <= left; i++)
           buf.append('/').append(paths[i]);
       return buf.toString();
   }
}
