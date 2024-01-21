package com.example.assingnment_session7facebook_timeline;

public class Data {

        private String username;
        private String timestamp;

        private int backgroundcolour;

        private String numbersLike;
        private String numbersShare;

        public Data(String content, String timestamp, int backgroundcolour , String numbersLike , String numbersShare) {
            this.username = content;
            this.timestamp = timestamp;
            this.backgroundcolour=backgroundcolour;
            this.numbersLike=numbersLike;
            this.numbersShare=numbersShare;
        }

        public String getContent() {
            return username;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public int getBackgroundcolour(){
            return backgroundcolour;
        }

        public String getNumbersLike() {
            return numbersLike;
        }

        public String getNumbersShare() {
            return numbersShare;
        }


}
