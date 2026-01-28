import java.util.regex.*;

public class bt6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] bad = {"tệ", "ngu ngốc"};

        String text = review;
        for (String w : bad) {
            Pattern p = Pattern.compile("\\b" + w + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(text);

            StringBuilder star = new StringBuilder();
            for (int i = 0; i < w.length(); i++) star.append("*");

            text = m.replaceAll(star.toString());
        }

        int limit = 50;
        String out = text;

        if (text.length() > limit) {
            StringBuilder sb = new StringBuilder(text.substring(0, limit));
            int i = sb.lastIndexOf(" ");
            if (i != -1) sb.setLength(i);
            sb.append("...");
            out = sb.toString();
        }

        System.out.println("Review: " + out);
    }
}
