package life.iGuaDa.community.model;

public class Collection {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.user_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collection.question_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    private Long questionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.id
     *
     * @return the value of collection.id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.id
     *
     * @param id the value for collection.id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.user_id
     *
     * @return the value of collection.user_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.user_id
     *
     * @param userId the value for collection.user_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collection.question_id
     *
     * @return the value of collection.question_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collection.question_id
     *
     * @param questionId the value for collection.question_id
     *
     * @mbg.generated Fri Jun 17 11:29:50 CST 2022
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}