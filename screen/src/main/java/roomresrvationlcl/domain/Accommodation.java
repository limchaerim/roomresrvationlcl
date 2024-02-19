package roomresrvationlcl.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import roomresrvationlcl.ScreenApplication;
import roomresrvationlcl.domain.AccommodationCanceled;
import roomresrvationlcl.domain.AccommodationReserved;
import roomresrvationlcl.domain.StatusChangeCompleted;

@Entity
@Table(name = "Accommodation_table")
@Data
//<<< DDD / Aggregate Root
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accId;

    private String facility;

    private String name;

    private Date strDate;

    private Date endDate;

    private String personnel;

    private String uesrId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        AccommodationReserved accommodationReserved = new AccommodationReserved(
            this
        );
        accommodationReserved.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        AccommodationCanceled accommodationCanceled = new AccommodationCanceled(
            this
        );
        accommodationCanceled.publishAfterCommit();

        StatusChangeCompleted statusChangeCompleted = new StatusChangeCompleted(
            this
        );
        statusChangeCompleted.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static AccommodationRepository repository() {
        AccommodationRepository accommodationRepository = ScreenApplication.applicationContext.getBean(
            AccommodationRepository.class
        );
        return accommodationRepository;
    }
}
//>>> DDD / Aggregate Root
