package main.java.Sem2;

public class Sem2_1_HW {
    public static void main(String[] args) {
        String str = "select * from students where ";
        String sql = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] strings = sql.replaceAll(":", "=").replaceAll("\\p{P}", "").replaceAll("\\s", " ").split(" ");
        StringBuilder bui = new StringBuilder();
        bui.append(strings[0]).append(", ").append(strings[1]).append(", ").append(strings[2]);
        System.out.println(str + bui);
    }
}
