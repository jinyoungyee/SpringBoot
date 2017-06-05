package journal;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mufasa on 17. 6. 5.
 */
@Entity
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Date created;
    private String summary;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    public Journal(String title,String date,String summary) throws ParseException {
        this.created = format.parse(date);
        this.title = title;
        this.summary = summary;
    }

    Journal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public String getCreateAsShort() {
        return format.format(created);
    }

    public String getString() {
        StringBuilder value = new StringBuilder( "JournalEntity ( "   );
        value.append("Id : ");
        value.append(id);
        value.append(",Title");
        value.append(title);
        value.append(",Summary");
        value.append(summary);
        value.append(",Created");
        value.append(getCreateAsShort());
        return value.toString();
    }

}
