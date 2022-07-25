package practise.sys;

import lombok.Getter;
import lombok.Setter;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

@Setter
@Getter
public class Menu implements MenuInter {
    private String[] id;
    private String[] content;
    private Dictionary<String, String> dictionary = new Hashtable<>();


    public Menu(String ids, String contents) {
        this.id = ids.split(" ");
        this.content = contents.split(" ");
        if (content.length != id.length) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            this.dictionary.put(id[i], content[i]);
        }
    }

    public Menu() {

    }

    @Override
    public String enterChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n输入选项: ");
        return scan.next();
    }

    @Override
    public void display() {
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.printf("\t\t%s.%s", i, dictionary.get(String.valueOf(i)));
        }
    }

}