
package sampa.com.imagesearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("animated")
    @Expose
    private Boolean animated;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("bandwidth")
    @Expose
    private Long bandwidth;
    @SerializedName("vote")
    @Expose
    private Object vote;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("account_url")
    @Expose
    private String accountUrl;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("comment_preview")
    @Expose
    private Object commentPreview;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("topic_id")
    @Expose
    private Integer topicId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("ups")
    @Expose
    private Integer ups;
    @SerializedName("downs")
    @Expose
    private Integer downs;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("is_album")
    @Expose
    private Boolean isAlbum;
    @SerializedName("gifv")
    @Expose
    private String gifv;
    @SerializedName("webm")
    @Expose
    private String webm;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("looping")
    @Expose
    private Boolean looping;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("cover_width")
    @Expose
    private Integer coverWidth;
    @SerializedName("cover_height")
    @Expose
    private Integer coverHeight;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("images_count")
    @Expose
    private Integer imagesCount;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The datetime
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * 
     * @param datetime
     *     The datetime
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The animated
     */
    public Boolean getAnimated() {
        return animated;
    }

    /**
     * 
     * @param animated
     *     The animated
     */
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * 
     * @param views
     *     The views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 
     * @return
     *     The bandwidth
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * 
     * @param bandwidth
     *     The bandwidth
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * 
     * @return
     *     The vote
     */
    public Object getVote() {
        return vote;
    }

    /**
     * 
     * @param vote
     *     The vote
     */
    public void setVote(Object vote) {
        this.vote = vote;
    }

    /**
     * 
     * @return
     *     The favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    /**
     * 
     * @param favorite
     *     The favorite
     */
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    /**
     * 
     * @return
     *     The nsfw
     */
    public Boolean getNsfw() {
        return nsfw;
    }

    /**
     * 
     * @param nsfw
     *     The nsfw
     */
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    /**
     * 
     * @return
     *     The section
     */
    public String getSection() {
        return section;
    }

    /**
     * 
     * @param section
     *     The section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * 
     * @return
     *     The accountUrl
     */
    public String getAccountUrl() {
        return accountUrl;
    }

    /**
     * 
     * @param accountUrl
     *     The account_url
     */
    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    /**
     * 
     * @return
     *     The accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The account_id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The commentPreview
     */
    public Object getCommentPreview() {
        return commentPreview;
    }

    /**
     * 
     * @param commentPreview
     *     The comment_preview
     */
    public void setCommentPreview(Object commentPreview) {
        this.commentPreview = commentPreview;
    }

    /**
     * 
     * @return
     *     The topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 
     * @param topic
     *     The topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * 
     * @return
     *     The topicId
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * 
     * @param topicId
     *     The topic_id
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The comment_count
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 
     * @return
     *     The ups
     */
    public Integer getUps() {
        return ups;
    }

    /**
     * 
     * @param ups
     *     The ups
     */
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    /**
     * 
     * @return
     *     The downs
     */
    public Integer getDowns() {
        return downs;
    }

    /**
     * 
     * @param downs
     *     The downs
     */
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    /**
     * 
     * @return
     *     The points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 
     * @param points
     *     The points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 
     * @return
     *     The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The isAlbum
     */
    public Boolean getIsAlbum() {
        return isAlbum;
    }

    /**
     * 
     * @param isAlbum
     *     The is_album
     */
    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    /**
     * 
     * @return
     *     The gifv
     */
    public String getGifv() {
        return gifv;
    }

    /**
     * 
     * @param gifv
     *     The gifv
     */
    public void setGifv(String gifv) {
        this.gifv = gifv;
    }

    /**
     * 
     * @return
     *     The webm
     */
    public String getWebm() {
        return webm;
    }

    /**
     * 
     * @param webm
     *     The webm
     */
    public void setWebm(String webm) {
        this.webm = webm;
    }

    /**
     * 
     * @return
     *     The mp4
     */
    public String getMp4() {
        return mp4;
    }

    /**
     * 
     * @param mp4
     *     The mp4
     */
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    /**
     * 
     * @return
     *     The looping
     */
    public Boolean getLooping() {
        return looping;
    }

    /**
     * 
     * @param looping
     *     The looping
     */
    public void setLooping(Boolean looping) {
        this.looping = looping;
    }

    /**
     * 
     * @return
     *     The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * 
     * @param cover
     *     The cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 
     * @return
     *     The coverWidth
     */
    public Integer getCoverWidth() {
        return coverWidth;
    }

    /**
     * 
     * @param coverWidth
     *     The cover_width
     */
    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    /**
     * 
     * @return
     *     The coverHeight
     */
    public Integer getCoverHeight() {
        return coverHeight;
    }

    /**
     * 
     * @param coverHeight
     *     The cover_height
     */
    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
    }

    /**
     * 
     * @return
     *     The privacy
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * 
     * @param privacy
     *     The privacy
     */
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * 
     * @return
     *     The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * 
     * @param layout
     *     The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * 
     * @return
     *     The imagesCount
     */
    public Integer getImagesCount() {
        return imagesCount;
    }

    /**
     * 
     * @param imagesCount
     *     The images_count
     */
    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
