package com.etsy.utils;

public class Constants {

    public static final class Url {
        private Url() {}
        public static final String URL = "https://www.etsy.com/";
    }

    public static final class Attributes {
        private Attributes() {}
        public static final String DATA_TITLE = "data-title";
    }

    public static final class Language {
        private Language(){}
        public static final String ENGLISH = "en-US";
    }

    public static final class Datos {
        private Datos(){}
        public static final String NAME = "Karen";
        public static final String PASSWORD = "abc123";
        public static final String EMAIL_FIRST_PART = "karend.539+";
        public static final String EMAIL_SECOND_PART = "@gmail.com";
    }

    public static final class Messages {
        private Messages() {}

        public static final String CREATE_ACCOUNT_ERROR_MESSAGE = "An error occurred creating the account.";
        public static final String ADD_PRODUCT_ERROR_MESSAGE = "There was an error adding the product.";
        public static final String LOGIN_ERROR_MESSAGE = "An error occurred when logging in.";

    }

    public static final class Time {
        private Time() {}
        public static final class Seconds {
            public static int TEN = 10;
        }
    }
}