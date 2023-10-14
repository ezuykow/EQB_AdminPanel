package ru.ezuykow.eqbadminpanel.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
import java.util.UUID;

@JmixEntity
@Table(name = "QUESTION", indexes = {
        @Index(name = "IDX_QUESTION_AUTHOR", columnList = "AUTHOR_ID"),
        @Index(name = "IDX_QUESTION_QUESTION_GROUP", columnList = "QUESTION_GROUP_ID")
})
@Entity
public class Question {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "AUTHOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_GROUP_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private QuestionsGroup questionGroup;

    @InstanceName
    @NotBlank
    @Column(name = "TEXT", nullable = false, length = 2048)
    @NotNull
    private String text;

    @Column(name = "ANSWERS", nullable = false, length = 1024)
    @NotNull
    private String answers;

    @Column(name = "ADDITIONAL_INFO", length = 2048)
    private String additionalInfo;

    @OneToMany(mappedBy = "question")
    private Set<Hint> hints;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public QuestionsGroup getQuestionGroup() {
        return questionGroup;
    }

    public void setQuestionGroup(QuestionsGroup questionGroup) {
        this.questionGroup = questionGroup;
    }

    public Set<Hint> getHints() {
        return hints;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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