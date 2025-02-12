package com.gym.exerciseservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercises")
public class Exercise {
    @Id
    private String id;
    private String name;
    private String description;
    private String muscleGroup;

    public Exercise() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMuscleGroup() {
        return this.muscleGroup;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Exercise)) return false;
        final Exercise other = (Exercise) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$muscleGroup = this.getMuscleGroup();
        final Object other$muscleGroup = other.getMuscleGroup();
        if (this$muscleGroup == null ? other$muscleGroup != null : !this$muscleGroup.equals(other$muscleGroup))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Exercise;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $muscleGroup = this.getMuscleGroup();
        result = result * PRIME + ($muscleGroup == null ? 43 : $muscleGroup.hashCode());
        return result;
    }

    public String toString() {
        return "Exercise(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", muscleGroup=" + this.getMuscleGroup() + ")";
    }
}