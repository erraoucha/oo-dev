# Clash of Animals

**Clash of Animals** is a Java project that demonstrates the principles of **Contract Programming** and adheres to the **Open/Closed Principle** (OCP) from SOLID design principles. By defining strong interfaces and leveraging abstraction, the project allows seamless creation and integration of new animal breeds without altering the existing codebase.

## Principles Demonstrated: Open to Extension, Closed to Modification

The project achieves **extensibility** through the use of interfaces like `Aggressive`, `Perishable`, `Carnivore`, and `Herbivore`. These interfaces define behaviors and contracts that all animal types must adhere to, enabling developers to extend the system by creating new animal breeds without modifying existing implementations.

### Key Interfaces and Their Roles

1. **Aggressive**
   - Defines attack behavior (`attack`) and allows attaching specific attack strategies (`attachAttackStrategy`).
   - Enables animals like predators to incorporate unique attack effects (e.g., 2D or 3D effects).

2. **Carnivore (Extends Aggressive)**
   - Specializes the `Aggressive` behavior for carnivores by adding the ability to "devour" herbivores (`tryToDevour`).
   - Supports defining carnivores with specific attributes like `numberOfCanines`.

3. **Herbivore**
   - Defines herbivores' unique attribute (`getRuminatingDuration`), allowing integration of animals like gazelles and elephants.

4. **Perishable**
   - Provides common behaviors for all living creatures, such as retrieving the death date (`getDeathDate`) and marking the entity as dead (`dies`).

### Extending the System with New Animal Breeds

By adhering to the **Open/Closed Principle**, this project allows developers to:

- **Add New Animals**: 
  - For example, a new predator like a **Lion** or a new herbivore like a **Deer** can be created by implementing `Carnivore` or `Herbivore`, respectively.
- **Customize Behavior**:
  - Attack strategies (e.g., `AttackEffect3D`, `AttackEffect2D`) can be attached dynamically to make attacks visually or behaviorally distinct.
- **Reuse Contracts**:
  - Common behaviors like `dies` or `getDeathDate` are shared across all animals by implementing `Perishable`.

### Example of Extensibility

To create a new predator, **Lion**:
1. Implement `Carnivore` and define:
   - `tryToDevour` to specify its predatory behavior.
   - `getNumberOfCanines` for its physical traits.
   - Use `attachAttackStrategy` to define custom attack effects (e.g., "Savage Pounce").
2. No need to modify existing classes or interfaces—just add the new `Lion` class.

To create a new herbivore, **Deer**:
1. Implement `Herbivore` and define:
   - `getRuminatingDuration` to set its specific dietary behavior.
   - Implement `Perishable` for life cycle management.

### Advantages of Open/Closed Principle

- **Scalability**: Adding new animal types or behaviors requires no changes to existing code, reducing the risk of breaking functionality.
- **Modularity**: Interfaces provide clear separation of concerns, making it easy to maintain and enhance individual components.
- **Flexibility**: Developers can introduce new features (e.g., advanced attack effects or additional attributes) without reworking existing logic.

By applying these principles, **Clash of Animals** fosters a system that is robust, extensible, and easy to maintain while ensuring adherence to strong design practices.
