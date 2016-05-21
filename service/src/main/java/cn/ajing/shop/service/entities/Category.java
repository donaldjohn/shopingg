package cn.ajing.shop.service.entities;

/**
 * Created by Administrator on 2016/5/21.
 */
public class Category {
    private int id;
    private String type;
    private Byte hot;
    private Integer aid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getHot() {
        return hot;
    }

    public void setHot(Byte hot) {
        this.hot = hot;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != category.id) return false;
        if (type != null ? !type.equals(category.type) : category.type != null) return false;
        if (hot != null ? !hot.equals(category.hot) : category.hot != null) return false;
        if (aid != null ? !aid.equals(category.aid) : category.aid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        return result;
    }
}
