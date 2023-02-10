// package com.adobe.aem.guides.wknd.core.models;

// import org.apache.commons.lang3.StringUtils;
// import org.apache.sling.api.resource.Resource;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;

// import com.day.cq.wcm.api.Page;
// import io.wcm.testing.mock.aem.junit5.AemContext;
// import io.wcm.testing.mock.aem.junit5.AemContextExtension;
// import com.adobe.aem.guides.wknd.core.testcontext.AppAemContext;

// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// /**
//  * Simple JUnit test verifying the HelloWorldModel
//  */
// @ExtendWith(AemContextExtension.class)

// public class CarouselgridModelTest {
//     private final AemContext context = new AemContext();

//     public static final String TEST_FILE = "/com/ancestrycomoperationsinc/core/models/arouselgridModel/carouselgrid.json";
//     private static final String CONTENT_ROOT = "/content";
//     private static final String CAROUSELGRID_ITEM = CONTENT_ROOT + "/carouselgrid";
//     private static final String NULL_ITEM = CONTENT_ROOT + "/null";

//     @BeforeEach
//     public void setup() {
//         context.addModelsForClasses(CarouselgridModel.class);
//         context.load().json(TEST_FILE, CONTENT_ROOT);
//     }

//     @Test
//     public void testGetCarouselgridList__full() {
//         context.currentResource(CAROUSELGRID_ITEM);
//         CarouselgridModel carouselgridModel = context.request().adaptTo(CarouselgridModel.class);
//         List<CarouselgridItem> expected = new ArrayList();
//         List<CarouselgridItem> actual = carouselgridModel.getCarouselgridList();

//         // Test normal
//         CarouselgridItem carouselgriditem1 = new CarouselgridItem("Carouselgrid 1");
//         CarouselgridItem carouselgriditem2 = new CarouselgridItem("Carouselgrid 2");

//         expected.add(carouselgriditem1);
//         expected.add(carouselgriditem2);

//         CarouselgridItem expected1 = expected.get(0);
//         CarouselgridItem expected2 = expected.get(1);
//         CarouselgridItem actual1 = actual.get(0);
//         CarouselgridItem actual2 = actual.get(1);

//         // test carouselgrid item 1
//         assertEquals(expected1.getTitle(), actual1.getTitle());

//         // test carouselgrid item 2
//         assertEquals(expected2.getTitle(), actual2.getTitle());
//     }

//     @Test
//     public void testGetCarouselgridList__null() {
//         context.currentResource(NULL_ITEM);
//         CarouselgridModel carouselgridModel = context.request().adaptTo(CarouselgridModel.class);

//         // Test null
//         assertTrue(carouselgridModel.getCarouselgridList().size() == 0);
//     }
// }
