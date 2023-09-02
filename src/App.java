public class App {
    public static void main(String[] args) throws Exception {
        Professor professorIgor = new Professor();

        professorIgor.name = "Igor";
        professorIgor.age = 30;
        professorIgor.salary = 10000.00;
        professorIgor.isGradueted = true;
        professorIgor.showProfessorInformations();


        Moto motoDoIgor = new Moto();

        motoDoIgor.licensePlate = "BRA5F42";
        motoDoIgor.tankCapacity = 17.3;
        motoDoIgor.paintColor = "Black";
        motoDoIgor.modelName = "XJ6";
        motoDoIgor.showMotoInformations();


        Carro carroDoIgor = new Carro();

        carroDoIgor.vehicleCategory = "Sport";
        carroDoIgor.brandName = "Porshe";
        carroDoIgor.maxSpeed = 325;
        carroDoIgor.engineModelName = "V6";
        carroDoIgor.showCarroInformations();


        Cachorro cachorroDoIgor = new Cachorro();

        cachorroDoIgor.name = "Javinha";
        cachorroDoIgor.breed = "Pinscher";
        cachorroDoIgor.age = 10;
        cachorroDoIgor.coatColor = "White";
        cachorroDoIgor.showCachorroInformations();


        Leao leaoDoIgor = new Leao();

        leaoDoIgor.habitat = "Savana";
        leaoDoIgor.lenght = 174;
        leaoDoIgor.isTrained = true;
        leaoDoIgor.ownerName = "Igor";
        leaoDoIgor.showLeaoInformations();


        Aluno alunoFavoritoDoIgor = new Aluno();

        alunoFavoritoDoIgor.name = "Eduardo";
        alunoFavoritoDoIgor.age = 17;
        alunoFavoritoDoIgor.note = 8.5;
        alunoFavoritoDoIgor.isHardWorking = true;
        alunoFavoritoDoIgor.showAlunoInformations();

    }
}