package ro.andreimihaescu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_roles")
@NamedQueries(
        @NamedQuery(name = "findRoleByUserId", query = "from UserRole u where u.userId = :userId")
)
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String roleType;

    private Date firstJoined;

    private String subscriptionType;

    public UserRole() {
    }

    public UserRole(Long userId, String roleType, String subscriptionType) {
        this.userId = userId;
        this.roleType = roleType;
        this.subscriptionType = subscriptionType;
        this.firstJoined = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user_id) {
        this.userId = user_id;
    }

    public Date getFirstJoined() {
        return firstJoined;
    }

    public void setFirstJoined(Date firstJoined) {
        this.firstJoined = firstJoined;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
