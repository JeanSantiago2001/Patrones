package Visitor;

public interface ArtworkVisitor {
    void visit(Painting painting);
    void visit(Sculpture sculpture);
}
