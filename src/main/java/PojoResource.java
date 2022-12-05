import lombok.Data;

import java.util.ArrayList;

@Data
public class PojoResource {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private ArrayList<Datum> data;
    private Support support;

    @Data
    public static class Datum{
        private Integer id;
        private String name;
        private Integer year;
        private String color;
        private String pantone_value;
    }

    @Data
    public static class Support{
        private String url;
        private String text;
    }
}
