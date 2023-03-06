package HW_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Dog dog = new Dog();

        dog.name="Fox";
        dog.age=1;
        dog.poroda="Akita Inu";
        System.out.println(dog.toString());
//        System.out.println(dog.name+" "+dog.age+" "dog.poroda);


Car car = new Car();
car.model = "Mersedes";
car.volumeEngine = 1.0;
car.power = 100;
car.turbo = true;
        System.out.println(car.toString());

        String[] Autors = {"John Doe"};
        Book book = new Book();
        book.title = "Harry Potter";
        book.pages = 1200;
        book.Authors = Autors;
        book.genre = "Fantesy";
        System.out.println(book);


        Posts posts = new Posts();
        posts.userId = 1;
        posts.id = 1;
        posts.title = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
        posts.body = "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto";

        System.out.println(posts.toString());


        Comments comments = new Comments();
        comments.userId = 1;
        comments.id = 1;
        comments.email = "Eliseo@gardner.biz";
        comments.name = "id labore ex et quam laborum";
        comments.body = "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium";
        System.out.println(comments.toString());


            System.out.println("End");
    }


}