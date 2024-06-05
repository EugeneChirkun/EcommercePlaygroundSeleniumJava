package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectData {

    HOME_PAGE("https://ecommerce-playground.lambdatest.io/"),
    LOGIN_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/login"),
    REGISTER_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/register"),
    ACCOUNT_CREATED_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/success");

    private String url;
}
