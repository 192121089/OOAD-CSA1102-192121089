

/**
 * Class voting_server
 */
public class voting_server {

  //
  // Fields
  //

  private void voter_id;
  private void candidate_id;
  private void vote_cout;
  
  //
  // Constructors
  //
  public voting_server () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of voter_id
   * @param newVar the new value of voter_id
   */
  private void setVoter_id (void newVar) {
    voter_id = newVar;
  }

  /**
   * Get the value of voter_id
   * @return the value of voter_id
   */
  private void getVoter_id () {
    return voter_id;
  }

  /**
   * Set the value of candidate_id
   * @param newVar the new value of candidate_id
   */
  private void setCandidate_id (void newVar) {
    candidate_id = newVar;
  }

  /**
   * Get the value of candidate_id
   * @return the value of candidate_id
   */
  private void getCandidate_id () {
    return candidate_id;
  }

  /**
   * Set the value of vote_cout
   * @param newVar the new value of vote_cout
   */
  private void setVote_cout (void newVar) {
    vote_cout = newVar;
  }

  /**
   * Get the value of vote_cout
   * @return the value of vote_cout
   */
  private void getVote_cout () {
    return vote_cout;
  }

  //
  // Other methods
  //

  /**
   */
  public void send_report()
  {
  }


  /**
   */
  public void count_votes()
  {
  }


}
