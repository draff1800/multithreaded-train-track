class TrainAProcess extends Thread {

    String trainName;
    TrainTrack theTrack;
    public TrainAProcess(String trainName, TrainTrack theTrack) {
        this.trainName = trainName;
        this.theTrack = theTrack;
    }

    @Override
    public void run() { //Move a single trainA from entry to exit
        theTrack.insertTrainAOnToTrack(trainName);
        theTrack.moveTrainAFromInsertionToJunction();
        theTrack.moveTrainThroughJunctionToBSide();
        theTrack.moveTrainAAroundBSide();
        theTrack.moveTrainThroughJunctionToASide();
        theTrack.moveTrainAToExit();
        theTrack.removeTrainAFromTrack(trainName);
    }

}


