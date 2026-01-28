public class Ex {
    public static void main(String[] args) {
        String rawBookID = "LIB-2024-S";
        String rawISBN = "0123456789";
        String rawTitle = "   lập trình jaVa căn bản   ";
        String rawAuthor = "nguyễn văn a";
        int year = 2023;

        boolean isIDValid = rawBookID.matches("^LIB-\\d{4}-S$");
        boolean isISBNValid = rawISBN.matches("^\\d{10}$");
        boolean isYearValid = (year <= 2026);

        if (isIDValid && isISBNValid && isYearValid) {
            String formattedTitle = formatTitle(rawTitle);
            String formattedAuthor = formatTitle(rawAuthor);

            StringBuilder citation = new StringBuilder();
            citation.append("[").append(rawBookID).append("] - ")
                    .append(formattedTitle).append(" - ")
                    .append(formattedAuthor).append(" (")
                    .append(year).append(")");

            System.out.println("----- KẾT QUẢ BIÊN MỤC -----");
            System.out.println("Mã sách chuẩn: " + rawBookID);
            System.out.println("ISBN-10: " + rawISBN);
            System.out.println("Tên sách: " + formattedTitle);
            System.out.println("Tác giả: " + formattedAuthor);
            System.out.println("Năm XB: " + year);
            System.out.println("Trích dẫn: " + citation.toString());
        } else {
            System.out.println("Dữ liệu đầu vào không hợp lệ!");
        }
    }

    public static String formatTitle(String input) {
        if (input == null || input.isEmpty()) return "";

        String[] words = input.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }
}