package ru.ezuykow.eqbadminpanel.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PREPARED_GAME", indexes = {
        @Index(name = "IDX_PREPARED_GAME_GAME", columnList = "GAME_ID")
})
@Entity
public class PreparedGame {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "KEY_", nullable = false)
    @NotNull
    private String key;

    @JoinColumn(name = "GAME_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Game game;

    @JoinTable(name = "PREPARED_GAME_QUESTIONS_GROUP_LINK",
            joinColumns = @JoinColumn(name = "PREPARED_GAME_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "QUESTIONS_GROUP_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<QuestionsGroup> questionsGroups;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public List<QuestionsGroup> getQuestionsGroups() {
        return questionsGroups;
    }

    public void setQuestionsGroups(List<QuestionsGroup> questionsGroups) {
        this.questionsGroups = questionsGroups;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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