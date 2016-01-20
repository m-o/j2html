package j2html.tags;

public class Text extends Tag {

    public Text(String text) {
        super(text);
    }

    @Override
    public String render() {
        return tag;
    }

    @Override
    public String toString() {
        return this.render();
    }

}
