package com.abhishek.item2;

/**
 * Created by AbhishekPatel on 9/10/2017.
 *
 * Item2 : Consider a builder when faced with many constructor parameters
 */
public class Request {
    private String requiredParameter1;
    private String requiredParameter2;

    private String optionalParameter1;
    private String optionalParameter2;
    private String optionalParameter3;
    private String optionalParameter4;

    private Request(Builder builder) {
        this.requiredParameter1 = builder.requiredParameter1;
        this.requiredParameter2 = builder.requiredParameter2;
        this.optionalParameter1 = builder.optionalParameter1;
        this.optionalParameter2 = builder.optionalParameter2;
        this.optionalParameter3 = builder.optionalParameter3;
        this.optionalParameter4 = builder.optionalParameter4;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requiredParameter1='" + requiredParameter1 + '\'' +
                ", requiredParameter2='" + requiredParameter2 + '\'' +
                ", optionalParameter1='" + optionalParameter1 + '\'' +
                ", optionalParameter2='" + optionalParameter2 + '\'' +
                ", optionalParameter3='" + optionalParameter3 + '\'' +
                ", optionalParameter4='" + optionalParameter4 + '\'' +
                '}';
    }

    public static class Builder {
        private String requiredParameter1;
        private String requiredParameter2;

        private String optionalParameter1;
        private String optionalParameter2;
        private String optionalParameter3;
        private String optionalParameter4;

        public Builder(String requiredParameter1, String requiredParameter2) {
            this.requiredParameter1 = requiredParameter1;
            this.requiredParameter2 = requiredParameter2;
        }

        public Builder optionalParameter1(String optionalParameter1) {
            this.optionalParameter1 = optionalParameter1;
            return this;
        }

        public Builder optionalParameter2(String optionalParameter2) {
            this.optionalParameter2 = optionalParameter2;
            return this;
        }

        public Builder optionalParameter3(String optionalParameter3) {
            this.optionalParameter3 = optionalParameter3;
            return this;
        }

        public Builder optionalParameter4(String optionalParameter4) {
            this.optionalParameter4 = optionalParameter4;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
