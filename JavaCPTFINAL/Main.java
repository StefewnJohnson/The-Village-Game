import java.util.Scanner; //imports scanner util
import java.util.ArrayList; //imports array lists 
import java.io.*; // imports all of java.io

class Main {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    int playAgain;

    do { // loops while player does not want to play again

      int numLives = 0; // sets inital numLives to 0
      int hp = 0; // sets inital hp to 0
      int xp = 0; // sets inital xp to 0
      Player pl = new Player(numLives, hp, xp); // creates a new player

      Meele m = new Meele(0); // sets inital melee damage to 0
      Sword sw = new Sword(0); // sets inital sword damage to 0
      Pistol pi = new Pistol(0, 0); // sets inital pistol damage and ammo to 0
      Spider sp = new Spider(0, 0, 0); // sets initial spider damage, hp, xp to 0
      Dragon d = new Dragon(0, 0, 0); // sets inital dragon damage, hp, xp to 0
      Knight k = new Knight(0, 0, 0); // sets inital knight damage, hp, xp to 0

      BaseBoss bb = new BaseBoss(); // creates a new base boss
      HardBoss hb = new HardBoss();// creates a new hard boss
      HarderBoss hrb = new HarderBoss(); // creates a new harder boss

      int difficulty;
      String selection = " ";
      boolean proceed = false; // inital sets proceed to false
      boolean proceed2 = false; // inital sets proceed2 to false
      int maxBattles = 6; // sets max battles a user can have to 6
      String currentAttack = " ";
      playAgain = 0;

      System.out.println(
          "Welcome to The Village. The rules of the game are simple. \n Battle the enemies you see before you beat the boss and free the village. \n Instructions for game will be given as you progess. Follow the instructions and have fun. Good Luck!");

      do { // loops until proceed is true

        System.out.println();
        System.out.println("Choose your difficulty (type the desired number): \n 1 Easy \n 2 Medium \n 3 Insane");
        difficulty = input.nextInt();

        if (difficulty == 1) { // if difficulty is set to 1 it does the following
          selection = "Easy"; // sets selection equal to easy

          numLives = pl.getnumLives();
          numLives = 5; // sets numLives to 5
          hp = pl.gethp();
          hp = 500; // sets hp to 500
          xp = pl.getxp();
          xp = 0; // sets starting xp to 0
          pl = new Player(numLives, hp, xp); // creates player with 5 lives 500 hp 0 xp

          m = new Meele(10); // sets melee damage to 10
          sw = new Sword(50); // sets sword damage to 50
          pi = new Pistol(70, 5); // sets pistol damage to 70 and pistol ammo to 5
          sp = new Spider(20, 50, 50); // sets spider damage to 20, spider hp to 50, spider xp to 50
          d = new Dragon(40, 100, 100); // sets dragon damage to 40, dragon hp to 100, dragon xp to 100
          k = new Knight(30, 70, 70); // sets knight damage to 30, knight hp to 70, knight xp to 70
          bb.hp = 100; // sets base boss hp to 100
          bb.xp = 100; // sets base boss xp to 100
          bb.damageStab = 70; // sets base boss stab damage to 70
          bb.damageBite = 50; // sets base boss bite damage to 50

          hb.hp = 150; // sets hard boss hp to 150
          hb.xp = 150; // sets hard boss xp to 150
          hb.arrowDamage = 100; // sets hard boss arrow damage to 100
          hb.spitDamage = 80; // sets hard boss spit damage to 80

          hrb.hp = 200; // sets harder boss hp to 200
          hrb.xp = 200; // sets harder boss xp to 200
          hrb.damageMinionArmy = 130; // sets harder boss minion army damage to 130
          hrb.damageMachineGun = 110; // sets machine gun damage to 110

          proceed = true; // sets proceed equal to true
        } else if (difficulty == 2) { // if difficuty is set to 2 it does the following

          selection = "Medium"; // sets selection to medium

          numLives = pl.getnumLives();
          numLives = 3; // sets num lives to 3
          hp = pl.gethp();
          hp = 300; // sets hp to 300
          xp = pl.getxp();
          xp = 0; // sets inital xp to 0
          pl = new Player(numLives, hp, xp);
          m = new Meele(5); // sets meele damage to 5
          sw = new Sword(30); // sets sword damage to 30
          pi = new Pistol(50, 3); // sets pistol damage to 50 and pistol ammo to 3
          sp = new Spider(25, 70, 70);// sets spider damage to 25, spiders hp to 70, spiders xp to 70
          d = new Dragon(50, 120, 120); // sets dragon damage to 50, dragon hp to 120, dragon xp to 120
          k = new Knight(40, 100, 100); // sets knight damage to 40, knight hp to 100, knight xp to 100

          bb.hp = 150; // sets base boss hp to 150
          bb.xp = 150; // sets base boss xp to 150
          bb.damageStab = 70; // sets base boss stab damage to 70
          bb.damageBite = 50; // sets base boss bite damage to 50

          hb.hp = 200; // sets hard boss hp to 200
          hb.xp = 2000; // sets hard boss xp to 200
          hb.arrowDamage = 100; // sets hard boss ammo damage to 100
          hb.spitDamage = 80; // sets hard boss spit damage to 80

          hrb.hp = 250; // sets harder boss hp to 250
          hrb.xp = 250; // sets harder boss xp to 250
          hrb.damageMinionArmy = 130; // sets harderboss minion army damage to 130
          hrb.damageMachineGun = 110; // sets harder boss machine gun damage to 110

          proceed = true; // sets proceed equal to true
        } else if (difficulty == 3) { // if difficulty is set to 3 does the following

          selection = "Insane"; // sets selection to insane

          numLives = pl.getnumLives();
          numLives = 1; // sets player numlives to 1
          hp = pl.gethp();
          hp = 100; // sets player hp to 100
          xp = pl.getxp();
          xp = 0; // sets inital player xp to 0;
          pl = new Player(numLives, hp, xp); // creates a new player with 1 life, 100 hp, 0 inital xp

          m = new Meele(3); // sets melee damage to 3
          sw = new Sword(10); // sets sword damage to 10
          sp = new Spider(30, 100, 100); // sets spider damage to 30, spider hp to 100, spider xp to 100
          d = new Dragon(60, 130, 150); // sets dragon damage to 60, dragon hp to 130, dragon hp to 150
          k = new Knight(50, 125, 125); // sets knight damage to 50, knight hp to 125, sets xp to 125

          bb.hp = 200; // sets base boss hp to 200
          bb.xp = 200; // sets base boss xp to 200
          bb.damageStab = 70;// sets base boss stab damage to 70
          bb.damageBite = 50; // sets base boss stab damage to 50

          hb.hp = 250; // sets hard boss hp to 250
          hb.xp = 250; // sets hard boss xp to 250
          hb.arrowDamage = 100; // sets hard boss arrow damage to 100
          hb.spitDamage = 80; // sets hard boss spit damage to 80

          hrb.hp = 300; // sets harder boss hp to 300
          hrb.xp = 300; // sets harder boss xp to 300
          hrb.damageMinionArmy = 130; // sets harder boss minion army damage to 130
          hrb.damageMachineGun = 110; // sets harder boss machine gun damage to 110

          proceed = true; // sets proceed to true
        } else { // if difficulty is not a valid entry does this
          proceed = false;
          System.out.println("Your selection is invalid");
        }
      } while (proceed == false);
      System.out.println("Your selection: " + selection);
      System.out.println();
      input.nextLine();

      String name;
      System.out.print("Choose your name (type name): ");
      name = input.nextLine(); // allows the user to select there name

      System.out.println("Once upon a time there was a peaceful village, until it was overcome with evil. " + name
          + " it is your duty to defeat them and liberate the village. We need your help!");

      System.out.println();

      // displays player stats
      System.out.print("Based on your difficulty level (" + selection
          + ") you have been granted the following: \n Lives - " + pl.getnumLives() + "\n Health - " + pl.gethp()
          + "\n Meele damage - " + m.damage + "\n Sword damage - " + sw.damage);

      if (!selection.equals("Insane")) { // runs if selection doesn't equal Insane
        System.out.println("\n Pistol damage - " + pi.damage + "\n Pistol ammo - " + pi.ammo);
      } else {
        System.out.println();
      }

      ArrayList<String> Enemies = new ArrayList<String>(); // creates a new array list with the possible enemies

      Enemies.add("Spider");
      Enemies.add("Dragon");
      Enemies.add("Knight");

      ArrayList<String> Boss = new ArrayList<String>(); // creates possible array lists with the bosses the player can encounter
      Boss.add("Base Boss");
      Boss.add("Hard Boss");
      Boss.add("Harder Boss");

      ArrayList<String> bossMoves = new ArrayList<String>(); // creates an array list with the bossMoves

      String currentEnemy = " "; // sets current enemy to blank

      int originalBaseBossHp = bb.hp; // sets original hp to base boss max hp
      int originalBaseBossXp = bb.xp; // sets original xp to base boss max xp
      int originalPlayerHp = pl.gethp(); // sets original player hp to max player hp

      do { // loops while max battles is greater than 0 and player has greater then 0 lives

        if (maxBattles > 3) { // if max battles is more than 3 it does the following
          int enemyRandom = (int) (((Enemies.size() - 1) - 0 + 1) * Math.random() + 0); // generates random number ranging from 0 to the size of the Enemies array
          currentEnemy = Enemies.get(enemyRandom); // sets current enemy to the index value that corresponds with the random num
          Enemies.remove(enemyRandom); // removes generated enemy from the array list
        } else { // if max battles is less than or equal to 3 does the following
          int boss = 0; // makes boss appear in order
          currentEnemy = Boss.get(boss); // sets current enemy to the index value that corresponds with the boss
          Boss.remove(boss); // removes generated boss from the array list
        }
        // default stats
        int currentEnemyDamage = 0;
        int currentEnemyHp = 0;
        int currentEnemyXp = 0;
        String userAttack = " ";
        boolean facingBoss = false;

        System.out.println();
        System.out.println("You have encountered a " + currentEnemy);

        if (currentEnemy.equals("Spider")) { // if current enemy is spider does the following
          System.out.println(
              "While exploring an abandoned house filled with the key to defeating the evil empire a spider has cornered you. You have no choice left but to attack");
          System.out.println("Defeat the spider and don't let it steal the secret code");
          currentEnemyDamage = sp.damage; // sets the current enemies damage to spider damage
          currentEnemyHp = sp.hp; // sets current enemy hp to spider hp
          currentEnemyXp = sp.xp; // sets current enermy xp to spider xp
        } else if (currentEnemy.equals("Dragon")) { // if current enemy is dragon does the following
          System.out
              .println("While you were in the firey pit of doom looking for answers, new weapons, and secret passages");
          System.out.println(
              "an evil dragon has appeared out of nowhere threatening your livelyhood and your chances to liberate the village");
          System.out.println(
              "Make the village proud and weaken the evil empire by slaying the dragon and taking its hidden xp");
          currentEnemyDamage = d.damage; // sets current enemy damage to dragon damage
          currentEnemyHp = d.hp; // sets current enemy hp to dragon hp
          currentEnemyXp = d.xp; // sets current enemy xp to dragon xp
        } else if (currentEnemy.equals("Knight")) { // if current enemy is knight does the following
          System.out.println(
              "It is dark at night when you were wondering along a path when out of nowhere to your surpise comes a knight.");
          System.out.println("He claims that you are trespassing and challenges you to a duel.");
          System.out.println("Beat him to proceed on your journey and liberate the village.");
          currentEnemyDamage = k.damage; // sets current enemy damage to knight damage
          currentEnemyHp = k.hp; // sets current enemy hp to knight hp
          currentEnemyXp = k.xp; // sets current enemy xp to knight xp
        }

        else if (currentEnemy.equals("Base Boss")) { // if current enemy is base boss does the following
          System.out.println(
              "You have defeated all the previous enemies now it's just you and the boss left \n defeat the boss. Liberate the village. Restore peace. \n the village depends on you!");

          System.out.println();
          System.out.println("After searching for many days you have found the boss, your fight starts now good luck.");

          facingBoss = true; // sets facing boss to true
          currentEnemyHp = bb.hp; // sets current enemy hp to base boss hp
          currentEnemyXp = bb.xp; // sets current enemy xp to base boss xp

          bossMoves.add("stab"); // adds stab into bossMoves array list
          bossMoves.add("bite"); // adds bite into bossMove array list
        }

        else if (currentEnemy.equals("Hard Boss")) { // if current enemy is hard boss does the following
          System.out.println(
              "The boss is stronger than you anticipated. \n the boss has evolved. He received more health and more attacks that will remain unknown until they are used.");

          facingBoss = true; // sets facing boss to true
          currentEnemyHp = originalBaseBossHp + 50; // adds 50 to original base boss hp and sets it to hard boss hp
          currentEnemyXp = originalBaseBossXp + 50; // add 50 to original base boss xp and sets it to hard boss xp

          bossMoves.add("arrow"); // adds arrow to boss moves array list
          bossMoves.add("spit"); // adds spit to boss moves array list

        }

        else if (currentEnemy.equals("Harder Boss")) { // if current enemy is harder boss does the following
          System.out.println(
              "The boss has yet again evolved gaining more health, more moves, and granting you with more xp if you defeat him.");

          facingBoss = true; // sets facingBoss to true
          currentEnemyHp = originalBaseBossHp + 100; // adds 100 to original base boss hp and sets it to harder boss hp
          currentEnemyXp = originalBaseBossXp + 100;// adds 100 to original base boss xp and sets it to harder boss xp
          
          bossMoves.add("minion army"); // adds minion army to bossMoves array list
          bossMoves.add("machine gun"); // adds machine gun to bossMoves array list

        }

        do { // loops while current enemy hp is greater than 0 and player lives is greater
             // than 0

          System.out.println("Their health is - " + currentEnemyHp);
          if (facingBoss == false) { // if not facing boss does the following
            System.out.println("Their damage is - " + currentEnemyDamage);
          } else { // if facing boss does the following
            System.out.println("Their damage is based on the moves they perform");
          }

          System.out.println("It's your turn to attack");
          System.out.print("Would you like to meele, or stab");
          if (!selection.equals("Insane")) { // if selection is not insane gives them the option to shoot
            System.out.print(", or shoot");
          }
          System.out.print(" (type your selection): ");
          userAttack = input.nextLine();

          currentEnemyHp = playerAttack(selection, m.damage, sw.damage, pi.damage, pi.ammo, currentEnemyHp, userAttack);// does damage to the enemy using the playerAttack method

          if (userAttack.equals("shoot") && !selection.equals("Insane")) { // if user chooses to shoot and difficulty is not insane does the following
            if (pi.ammo > 0) {// if pistol ammo is greater than 0 does the following
              pi.ammo--; // subtracts one from pistol ammo
              System.out.println("You have " + pi.ammo + " ammo remaining from your pistol");
            } else { // if ammo is 0 does the following
              System.out.println("because you are out of ammo");
            }
          }
          if (currentEnemyHp <= 0) { // if enemy hp is less than or equal to 0 does the following
            currentEnemyHp = 0; // sets current enemy hp to 0
          }

          System.out.println("The " + currentEnemy + "'s hp is now " + currentEnemyHp);
          System.out.println();

          if (isCurrentEnemyDead(currentEnemyHp, currentEnemyXp, xp, currentEnemy) == true) { // if is CurrentEnemyDead method returns true does the following

            xp = xp + currentEnemyXp; // adds currentEnemyXp to your xp
            if (foundAmmo(selection, pi.ammo) == true) { // if foundAmmo method returns true does the following
              pi.ammo = pi.ammo + 2; // adds 2 to player pistol ammo
            }
          }

          else { // if enemy is not dead does the following

            if (facingBoss == false) { // if facingBoss is false does the following
              pl.sethp(dodgeAttack(currentEnemyDamage, pl.gethp(), currentEnemy)); // sets player hp depending on what dodgeAttack method returns

            } else { // if facingBoss is true does the following
              int bossMoveRandom = (int) (((bossMoves.size() - 1) - 0 + 1) * Math.random() + 0); // generates randomNumber from size of bossMove array list to 0

              if (bossMoves.get(bossMoveRandom).equals("stab")) { // if boss move is stab does the following
                currentEnemyDamage = bb.damageStab; // current enemy damage is equal to stab damage
              }
              else if (bossMoves.get(bossMoveRandom).equals("bite")) { // if boss move is bite does the following
                currentEnemyDamage = bb.damageBite; // current enemy damage is equal to bite damage
              }
                
              else if (bossMoves.get(bossMoveRandom).equals("arrow")) { // if boss move is arrow does the following
                currentEnemyDamage = hb.arrowDamage; // current enemy damage is equal to arrow damage
              }

              else if (bossMoves.get(bossMoveRandom).equals("spit")) { // if boss move is spit does the following
                currentEnemyDamage = hb.spitDamage; // current enemy damage is equal to spit damage
              }

              else if (bossMoves.get(bossMoveRandom).equals("minion army")) { // if boss move is minion army does the following

                currentEnemyDamage = hrb.damageMinionArmy; // current enemy damage is equal to minion army damage
              }

              else if (bossMoves.get(bossMoveRandom).equals("machine gun")) { // if boss move is machine gun does the following
                currentEnemyDamage = hrb.damageMachineGun; // current enemy damage is equal to machine gun damage
              }

              pl.sethp(dodgeAttack(currentEnemyDamage, pl.gethp(), currentEnemy)); // calls dodge attack method and sets player hp to whatever dodgeAttack returns
            }

            if (isPlayerDead(pl.gethp(), pl.getnumLives()) == true) { // if player is dead does the following
              pl.sethp(0); // sets player hp to 0
              pl.setnumLives(pl.getnumLives() - 1); // takes one away from total lives
              pl.sethp(originalPlayerHp); // sets player hp to original health
            }

            if (pl.getnumLives() == 0) { // if player is out of lives does the following
              playerIsOutOfLives(); // calls player is out of lives method
            }

            else { // if player is not out of lives does the following
              System.out.println("Your hp is now " + pl.gethp());
              System.out.println("You have " + pl.getnumLives() + " lives left");
            }

            System.out.println();
          }
        } while (currentEnemyHp > 0 && pl.getnumLives() > 0);
        maxBattles--; // subtracts one from max battles

        if (facingBoss == false && pl.getnumLives() > 0) { // if not facing boss and player has higher then 0 lives, does the following
          System.out
              .println("Now that you have defeated the enemy, you have " + (maxBattles - 3)
                  + " left before the final boss. ");
          if ((maxBattles - 3) == 0) { // if max battles - 3 is 0 does the following
            System.out.println("This means all enemys are wiped out, you are now left with the boss to face");
          } else if (pl.getnumLives() > 0 && facingBoss == true) { // if max battles - 3 is not 0 does the following
            System.out.println("Good job soldier keep up the good work and save the village from evil");
          }
        }

      } while (maxBattles > 0 && pl.getnumLives() > 0);

      if (pl.getnumLives() > 0) { // runs if the player lives is greater then 0
        System.out.println("");
        System.out.println("Congratulations " + name
            + " you have succesfully beat all the enemies including the boss! \nThe village is finally liberated from the evil that had taken it captive. \nThis was an extremely difficult task that not everyone could have done! \n but you "
            + name
            + " were worthy of this challange. \nYou saved us all and for that the Village will be forver thankful for you bravery and success. Thank you "
            + name + " we are forver grateful");
      }
      userScores(xp, name); // activates highScore method and sends players final xp and name to the method

      System.out.println(); // skips a line

      do {// loops while proceed is false
        System.out.print("Do you want to play again(Enter 1 for yes and 0 for no): ");
        playAgain = input.nextInt();

        if (playAgain == 1) { // if playAgain is one does the following
          proceed2 = true; // sets procceed to true
          System.out.println(); // skips a line
          System.out.println("Thank you for playing again");

        }

        else if (playAgain == 0) { // if playAgain is 0 does the following
          proceed2 = true; // sets proceed to false
          System.out.println(); // skips a line
          System.out.println("Thank you for playing");
          System.out.println("I hope you have a great day");

        }

        else { // if not 0 or 1 does the following
          System.out.println("The input you entered is invalid, please enter again");

        }

        System.out.println(); // skips a line

      } while (proceed2 == false);

    } while (playAgain == 1);
  }

  /**
   * Method, playerAttack will perform the playerAttack depending on the user attack option and perform the damage on the enemy
   * Method will return an int currentEnemyHp
   * 
   * @param selection, meleeDamage, stabDamage, shootDamage, ammo, currentEnemyHp,
   *                   userAttack
   *                   returns int, currentEnemyHp
   */

  public static int playerAttack(String selection, int meleeDamage, int stabDamage, int shootDamage, int ammo,
      int currentEnemyHp, String userAttack) {

    if (userAttack.equalsIgnoreCase("meele")) { // if user chooses meele does the following
      currentEnemyHp = currentEnemyHp - meleeDamage; // sets current enemy hp equal to its hp minus damage dealt
      return currentEnemyHp; // returns enemy hp
    } else if (userAttack.equalsIgnoreCase("stab")) { // if user chooses stab does the following
      currentEnemyHp = currentEnemyHp - stabDamage; // sets current enemy hp equal to its hp minus damage dealt
      return currentEnemyHp; // returns enemy hp
    } else if (userAttack.equalsIgnoreCase("shoot") && !selection.equals("Insane") && ammo > 0) { // if user chooses shoot and selection is not insane does the following
      currentEnemyHp = currentEnemyHp - shootDamage; // sets current enemy hp equal to its hp minus damage dealt
      return currentEnemyHp; // returns enemy hp
    } else { // if not a valid option does the following
      System.out.println("You have missed your opportunity to attack");
      userAttack = "";
      return currentEnemyHp;// returns current enemy hp
    }
  }

  /**
   * Method, dodgeAttack will check if the user has dodged the attack depending on what number the user has entered 
   * Method will return an int playerHp
   * 
   * @param enemyDamage, playerHp, currentEnemy
   *                     returns int, playerHp
   */

  public static int dodgeAttack(int enemyDamage, int playerHp, String currentEnemy) {
    int dodgeAttack = (int) ((4 - 1 + 1) * Math.random() + 1); // generates a random num from 1 to 4

    System.out.println("It is now the " + currentEnemy + "'s turn to attack it will do " + enemyDamage
        + " damage. \n You can dodge the attack by guessing the correct number from 1 to 4.");

    System.out.print("Enter your guess from 1 to 4: ");
    int dodgeGuess = input.nextInt(); // prompts user for a guess
    input.nextLine();

    if (dodgeGuess == dodgeAttack) { // if guess equals number generated does the following
      System.out.println();
      System.out.println("You have successfully dodged the attack. No damage will be dealt to you!");
    } else { // else does the following
      System.out.println();
      System.out.println("You failed to dodge the attack damage will be dealt to you!");
      playerHp = playerHp - enemyDamage; // takes away enemies damage from players hp
    }

    return playerHp; // returns players hp
  }

  /**
   * Method, isPlayerDead will perform a check to see if the player is dead or not and perform the necessary actions correspondingly 
   * Method will return an boolean either true or false
   * 
   * @param playerHealth, playerLives
   *                      returns boolean, true or false
   */

  public static boolean isPlayerDead(int playerHealth, int playerLives) {

    if (playerHealth <= 0) { // if players health is equal to or less than 0 does the following
      System.out.println();
      playerLives--; // takes away one from players lives
      System.out.println("You have lost this battle. You have " + playerLives + " lives remaining");
      return true; // returns true
    }
    return false; // returns false if player is not dead
  }

  /**
   * Method, playerIsOutOfLives will display a message saying the player is out of lives 
   * Method will return nothing
   * 
   * @param
   * returns        nothing
   */

  public static void playerIsOutOfLives() { // displays that player is out of lives
    System.out.println();
    System.out.println("Unfortunately you are out of lives. You were not able to liberate the village. Try again!");
  }

  /**
   * Method, isCurrentEnemyDead will perform a check to see if the enemy is dead or not 
   * Method will return an boolean true or false
   * 
   * @param currentEnemyHp, currentEnemyXp, playerXp, currentEnemy
   *                        returns boolean, true or false
   */

  public static boolean isCurrentEnemyDead(int currentEnemyHp, int currentEnemyXp, int playerXp, String currentEnemy) {

    if (currentEnemyHp == 0) { // if current enemy hp is dead does the following
      System.out.println();
      System.out.println("Congratulations You have defeated the " + currentEnemy);
      System.out.println("You have gained " + currentEnemyXp + " xp");
      playerXp = playerXp + currentEnemyXp; // adds enemy's xp to player's xp
      System.out.println("Your current xp is " + playerXp);
      return true; // returns true
    }
    return false; // returns false
  }

  /**
   * Method, foundAmmo will perform a check to see if the player has found ammo
   * after defeating an enemy 
   * Method will return an boolean true or false
   * 
   * @param selection, playerAmmo
   *                   returns boolean, true of false
   */

  public static boolean foundAmmo(String selection, int playerAmmo) {

    if (!selection.equalsIgnoreCase("Insane")) { // if selection is not insane does the following
      int foundAmmo = (int) ((6 - 1 + 1) * Math.random() + 1); // generates random num from 1 to 6
      if (foundAmmo == 2) { // if random num is 2 does the following
        playerAmmo = playerAmmo + 2; // adds 2 to player's ammo
        System.out.println("You have found more ammo. Your current ammo is " + playerAmmo);
        return true; // returns true
      }
    }
    return false; // returns false if not
  }

  /**
   * Method, userScores will display the scores of first place, second place, and
   * third place. If the user has a greater score then any of those then their score and name will replace that position 
   * Method will return nothing
   * 
   * @param xp, name
   *            returns nothing
   */

  public static void userScores(int xp, String name) {
    try {

      File file = new File("UsersScores.txt"); // Saves file name UserScores.txt into file variable
      int firstPlaceXp = 0, secondPlaceXp = 0, thirdPlaceXp = 0;
      String firstPlaceName = "Unknown", secondPlaceName = "Unknown", thirdPlaceName = "Unknown";

      if (!file.exists()) { // if file does not exists does the following
        FileWriter fw = new FileWriter("UsersScores.txt"); // creates file called UserScores.txt
        PrintWriter pw = new PrintWriter(fw);

        firstPlaceXp = xp; // first place is equal to xp
        firstPlaceName = name; // first place player name is equal to name

        pw.println(firstPlaceName); // prints first place name
        pw.println(firstPlaceXp); // prints first place xp
        pw.println(secondPlaceName); // prints second place name
        pw.println(secondPlaceXp); // prints second place xp
        pw.println(thirdPlaceName); // prints third place name
        pw.println(thirdPlaceXp); // prints third place xp

        pw.close(); // closes print writer

        System.out.println("First with a xp score of " + firstPlaceXp + " by " + firstPlaceName);
        System.out.println("Second with a xp score of " + secondPlaceXp + " by " + secondPlaceName);
        System.out.println("Third with a xp score of  " + thirdPlaceXp + " by " + thirdPlaceName);

      }

      else { // if file exists does the following

        FileReader fr = new FileReader("UsersScores.txt");

        Scanner s = new Scanner(fr); // reads file
        String line;
        int numLines = 0;

        do { // loops while there are more lines
          line = s.nextLine();

          int xpOnLine = 0;

          if (numLines % 2 != 0) { // if line number is odd does the following
            xpOnLine = Integer.parseInt(line);
          }

          if (numLines == 0) { // if num lines is 0 does the following
            firstPlaceName = line; // first place name is equal to the line
          } else if (numLines == 1) { // if num lines is 1 does the following
            firstPlaceXp = xpOnLine; // first place xp is equal to the line
          } else if (numLines == 2) { // if num lines is 2 does the following
            secondPlaceName = line; // second place name is equal to the line
          } else if (numLines == 3) { // if num lines is 3 does the following
            secondPlaceXp = xpOnLine; // second place xp is equal to the line
          } else if (numLines == 4) { // if num lines is 4 does the following
            thirdPlaceName = line; // third place name is equal to the line
          } else if (numLines == 5) { // if num lines is 5 does the following
            thirdPlaceXp = xpOnLine; // third place xp is equal to the line
          }

          numLines++; // adds one to num lines

        } while (s.hasNextLine());

        PrintWriter pw = new PrintWriter(file);

        if (xp > firstPlaceXp) { // if xp is greater than current first place does the following
          thirdPlaceName = secondPlaceName; // third place is equal to second place name
          thirdPlaceXp = secondPlaceXp; // third place is equal to second place xp
          secondPlaceName = firstPlaceName; // second place is equal to first place name
          secondPlaceXp = firstPlaceXp; // second place is equal to first place xp
          firstPlaceName = name;// first place name is equal to name
          firstPlaceXp = xp; // first place xp is equal to xp
        } else if (xp > secondPlaceXp) { // if xp is greater than second place
          thirdPlaceName = secondPlaceName; // third place name is equal to second place name
          thirdPlaceXp = secondPlaceXp; // third place xp is equal to second place xp
          secondPlaceName = name; // second place name is equal to name
          secondPlaceXp = xp; // second place xp is equal to xp
        }

        else if (xp > thirdPlaceXp) { // if xp is greater than third place does the following
          thirdPlaceName = name; // third place is equal to name
          thirdPlaceXp = xp; // third place is equal to xp
        }

        pw.println(firstPlaceName); // prints first place name
        pw.println(firstPlaceXp); // prints first place xp
        pw.println(secondPlaceName); // prints second place name
        pw.println(secondPlaceXp); // prints second place xp
        pw.println(thirdPlaceName); // prints third place name
        pw.println(thirdPlaceXp); // prints third place xp

        pw.close(); // close print writer

        // displays information to user
        System.out.println("First with a xp score of " + firstPlaceXp + " by " + firstPlaceName);
        System.out.println("Second with a xp score of " + secondPlaceXp + " by " + secondPlaceName);
        System.out.println("Third with a xp score of  " + thirdPlaceXp + " by " + thirdPlaceName);
      }

    } catch (IOException e) {

    }
  }
}