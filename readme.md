# Projeto Java Spring

## Extensões do VSCode

Extension Pack for Java
Spring Boot Extension Pack

## Iniciando um projeto Spring

abra o vscode
digite ctrl + shift + P
digite spring initialize

start.spring.io

Project:
Maven

Language:
Java

Spring Boot:
3.2.5

Packaging:
Jar

Java:
17

Dependecies
Spring web
Spring boot devtools
Spring Data JPA
H2 Database

## Inicie o projeto

Abra a pasta raiz do projeto
Add git init
adcione as alterações e suba o primeiro commit

Cire um resources dentro de students
Classe StudentController.java

Adicione a anotação
@RestController
@RequestMapping("students")

Crie dentro dela um método helloStudent() para testar

    public String helloStudent(){
        return "Hello from Student COntroller";
    }

Remova esse método e sua importação
Crie dentro da pasta students tbm uma pasta entities
Crie uma Classe Student.java

Crie os atributos do estudante
private Integer id;
private String name;
private String course;

Crie os getters e setters deles

Va na classe StudentController e crie um método Student getStudent()
adicione a anotação
@GetMapping

Construa um objeto dentro dela
Student s = new Student();

adicione cada um dos atributos do objeto:
s.setName("Gustavo Ferreira");
s.setId(1);
s.setCourse("Engenharia da Computação");

altere o método getStudent para getStudents
altere o tipo para LIst<Student>

Irá ficar assim:
@GetMapping
public List<Student> getStudents() {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setId(1);
        s1.setName("Gustavo Ferreira");
        s1.setCourse("Engenharia da Computação");

        s2.setId(2);
        s2.setName("Gabriel da Silva");
        s2.setCourse("Análise e Desenvolvimento de Sistemas");

        s3.setId(1);
        s3.setName("Ricardo Toiobo");
        s3.setCourse("Gestão de Tecnologia da Informação");

        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        return lista;

    }
