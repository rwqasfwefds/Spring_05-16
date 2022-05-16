package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Board
 * author : ds
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         ds          최초 생성
 */
// 라이브러리 Rombook을 설치해야 사용 할 수 있음
@Setter
@Getter
public class Board {
//    @JsonProperty : insert 테스트 json 형식으로 넣을때
    @JsonProperty(value = "idx")
    private int idx;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "content")
    private String content;

    @JsonProperty(value = "writer")
    private String writer;

    @JsonProperty(value = "viewCnt")
    private String viewCnt;

    @JsonProperty(value = "noticeYn")
    private String noticeYn;

    @JsonProperty(value = "secretYn")
    private String secretYn;

    @JsonProperty(value = "deleteYn")
    private String deleteYn;

    @JsonProperty(value = "insertTime")
    private String insertTime;

    @JsonProperty(value = "updateTime")
    private String updateTime;

    @JsonProperty(value = "deleteTime")
    private String deleteTime;
}
