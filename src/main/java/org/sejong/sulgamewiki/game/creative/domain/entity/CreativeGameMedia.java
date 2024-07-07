package org.sejong.sulgamewiki.game.creative.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sejong.sulgamewiki.common.entity.BaseMedia;
import org.sejong.sulgamewiki.common.entity.constants.MediaType;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class CreativeGameMedia extends BaseMedia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String mediaUrl;

  @Column(nullable = false)
  private Long fileSize;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private MediaType mediaType;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "creative_game_id", nullable = false)
  private CreativeGame creativeGame;
}
