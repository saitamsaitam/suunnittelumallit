package adapterdesign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EnemyTank tank = new EnemyTank();
		
		EnemyRobot enemyRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);
		
		
		System.out.println("The Robot");
		
		enemyRobot.reactToHuman("Ville");
		enemyRobot.walkForward();
		enemyRobot.smashWithHands();
		
		System.out.println("\nThe Enemy Tank");
		
		tank.assignDriver("Casper");
		tank.driveForward();
		tank.fireWeapon();
		
		System.out.println("\nThe Robot with Adapter");
		
		robotAdapter.assignDriver("John");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}

}
