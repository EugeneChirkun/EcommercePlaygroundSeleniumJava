package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectData {

    HOME_PAGE("https://ecommerce-playground.lambdatest.io/"),
    LOGIN_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

    private String url;
}
