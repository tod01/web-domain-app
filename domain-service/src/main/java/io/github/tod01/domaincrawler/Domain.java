package io.github.tod01.domaincrawler;


import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Domain {

    String domain;
    String create_date;
    String update_date;
    String country;
    boolean isDead;
    List<String> A;
    List<String> NS;
    String CNAME;
    List<Objects> MX;
    List<String> TXT;

}
