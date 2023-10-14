package ru.ezuykow.eqbadminpanel.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "TEAM", indexes = {
        @Index(name = "IDX_TEAM_PREPARED_GAME", columnList = "PREPARED_GAME_ID")
})
@Entity
public class Team {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PREPARED_GAME_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PreparedGame preparedGame;

    @Column(name = "CHAT_ID")
    private Long chatId;

    @Column(name = "POINTS")
    private Integer points;

    @Column(name = "STARTED_AT")
    private LocalDateTime startedAt;

    @Column(name = "HINTS_USED")
    private Integer hintsUsed;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime lastQuestionAnsweredAt) {
        this.startedAt = lastQuestionAnsweredAt;
    }

    public PreparedGame getPreparedGame() {
        return preparedGame;
    }

    public void setPreparedGame(PreparedGame preparedGame) {
        this.preparedGame = preparedGame;
    }

    public Integer getHintsUsed() {
        return hintsUsed;
    }

    public void setHintsUsed(Integer hintsUsed) {
        this.hintsUsed = hintsUsed;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer questionAnswered) {
        this.points = questionAnswered;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}