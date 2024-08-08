package org.sejong.sulgamewiki.game.popular.dto.response;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GetPopularGamesResponse {
  private String title;
  private String introduction;
  private String mediaUrl;
  private String author;
  private String university;
  private int likes;

  // todo : from 메서드
}
