package ru.ezuykow.eqbadminpanel.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "BOT_MESSAGE")
@Entity
public class BotMessage {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "MESSAGE", nullable = false, length = 1024)
    @NotNull
    private String message;

    @Column(name = "DEFAULT_MESSAGE", nullable = false, length = 1024)
    @NotNull
    private String defaultMessage;

    @Column(name = "KEY_", nullable = false)
    @NotNull
    private String key;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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