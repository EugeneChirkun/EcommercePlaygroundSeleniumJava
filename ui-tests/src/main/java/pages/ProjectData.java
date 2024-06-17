package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectData {

    HOME_PAGE("https://ecommerce-playground.lambdatest.io/"),
    LOGIN_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/login"),
    REGISTER_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/register"),
    ACCOUNT_CREATED_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/success"),
    EDIT_ACCOUNT_INFO_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/edit"),
    MY_ACCOUNT_PAGE("https://ecommerce-playground.lambdatest.io/index.php?route=account/account");

    private String url;
}
