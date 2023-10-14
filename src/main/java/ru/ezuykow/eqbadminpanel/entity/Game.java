package ru.ezuykow.eqbadminpanel.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "GAME", indexes = {
        @Index(name = "IDX_GAME_AUTHOR", columnList = "AUTHOR_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_GAME_UNQ_NAME", columnNames = {"NAME"})
})
@Entity
public class Game {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "AUTHOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @NotBlank
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Positive
    @Column(name = "QUESTIONS_COUNT", nullable = false)
    @NotNull
    private Integer questionsCount;

    @PositiveOrZero
    @Column(name = "ATTEMPT_TO_ANSWER_COUNT", nullable = false)
    @NotNull
    private Integer attemptToAnswerCount;

    @Column(name = "ADDITIONAL_INFO", length = 1024)
    private String additionalInfo;

    @Column(name = "ADDITIONAL_WITH_QUESTION")
    private Boolean additionalWithQuestion;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @OneToMany(mappedBy = "game")
    private List<PreparedGame> preparedGames;

    public List<PreparedGame> getPreparedGames() {
        return preparedGames;
    }

    public void setPreparedGames(List<PreparedGame> preparedGames) {
        this.preparedGames = preparedGames;
    }

    public Boolean getAdditionalWithQuestion() {
        return additionalWithQuestion;
    }

    public void setAdditionalWithQuestion(Boolean additionalWithQuestion) {
        this.additionalWithQuestion = additionalWithQuestion;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Integer getAttemptToAnswerCount() {
        return attemptToAnswerCount;
    }

    public void setAttemptToAnswerCount(Integer maxHintsPerQuestion) {
        this.attemptToAnswerCount = maxHintsPerQuestion;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
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