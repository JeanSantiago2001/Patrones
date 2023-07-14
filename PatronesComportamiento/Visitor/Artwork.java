package Visitor;

public abstract class Artwork {
    public abstract void accept(ArtworkVisitor visitor);
}

