## Singleton
[Co je to návrhový vzor Singleton?](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)

### Úloha
-Vytvořte singleton třídu s libovolnými atributy
- Vyprořte statickou metodu getInstance() která bude vracet aktuální instanci této třídy (případně vytvoří novou)
- Zkuste tuto instanci zístka z různých částí apilikace, různých vláken a pod.
- Jak zaručit, aby byla metoda getInstance "Thread safe?"

## Factory
[Co je to návrhový vzor Factory?](https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java)

### Úloha
- Vytvořte interface VehicleInterface obsahující metordy drive() a startEngine()
- Vytvořte abstraktní třídu Vehicle imlementující toto rozhraní.
- Vytvořte třídy Car, Bus, Boat rozšiřující třídu abstraktní třídu Vehicle 
- Vytvořte Factory VehicleFactory která bude vracet dopravní prostředek definovaný v parametru metody jako enum vehicleType *createVehicle(VehicleTypes vehicleType)*
- Vytvořte několik instancí pomoocí nově vytvořené factory. 
