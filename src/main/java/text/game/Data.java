package text.game;

public class Data {
    private static int cautionPoints = 0;
    private static int deductionPoints = 0;
    private static int recklessPoints = 0;
    private static int intelligencePoints = 0;
    private static int battleIQPoints = 0;
    
    public static int getCautionPoints() {
        return cautionPoints;
    }
    public static void setCautionPoints(int cautionPoints) {
        Data.cautionPoints = cautionPoints;
    }
    
    public static int getDeductionPoints() {
        return deductionPoints;
    }
    public static void setDeductionPoints(int deductionPoints) {
        Data.deductionPoints = deductionPoints;
    }
    
    public static int getRecklessPoints() {
        return recklessPoints;
    }
    public static void setRecklessPoints(int recklessPoints) {
        Data.recklessPoints = recklessPoints;
    }
    
    public static int getIntelligencePoints() {
        return intelligencePoints;
    }
    public static void setIntelligencePoints(int intelligencePoints) {
        Data.intelligencePoints = intelligencePoints;
    }
    
    public static int getBattleIQPoints() {
        return battleIQPoints;
    }
    public static void setBattleIQPoints(int battleIQPoints) {
        Data.battleIQPoints = battleIQPoints;
    }

    public static void resetData() {
        cautionPoints = 0;
        deductionPoints = 0;
        recklessPoints = 0;
        intelligencePoints = 0;
        battleIQPoints = 0;
    }

    public static int[] getAll() {
        return new int[]{cautionPoints, deductionPoints, recklessPoints, intelligencePoints, battleIQPoints};
    }
}
