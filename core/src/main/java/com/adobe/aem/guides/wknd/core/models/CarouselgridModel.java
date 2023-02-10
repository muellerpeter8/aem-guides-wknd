// package com.adobe.aem.guides.wknd.core.models;

// import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

// import javax.annotation.PostConstruct;

// import org.apache.commons.lang3.StringUtils;
// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ResourceResolver;
// import org.apache.sling.models.annotations.Default;
// import org.apache.sling.models.annotations.DefaultInjectionStrategy;
// import org.apache.sling.models.annotations.Model;
// import org.apache.sling.models.annotations.injectorspecific.SlingObject;
// import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

// import com.day.cq.wcm.api.Page;
// import com.day.cq.wcm.api.PageManager;

// import java.util.Optional;

// @Model(adaptables = Resource.class,
//      defaultInjectionStrategy =  DefaultInjectionStrategy.OPTIONAL)

// public class CarouselgridModel {

//     @ValueMapValue(name=PROPERTY_RESOURCE_TYPE)
//     @Default(values="No resourceType")
//     protected String resourceType;

//     @SlingObject
//     private Resource currentResource;
//     @SlingObject
//     private ResourceResolver resourceResolver;

//     private Resource carouselgridItems;
//     private List<CarouselgridItem> carouselgridList;

//     // property names
//     private final String CAROUSELGRID_TITLE_PROPERTY_NAME = "carouselgridItemTitle";

//     @PostConstruct
//     protected void init() {
//         carouselgridItems = request.getResource().getChild("carouselgridItems");
//         generateCarouselgridList();
//     }

//     protected void generateCarouselgridList() {
//         carouselgridList = new ArrayList<>();
//         if (carouselgridItems != null) {
//             Iterator<Resource> resourceIterator = carouselgridItems.listChildren();
//             while (resourceIterator.hasNext()) {
//                 Resource currentItem = resourceIterator.next();
//                 ValueMap properties = currentItem.getValueMap();
//                 String title = properties.get(CAROUSELGRID_TITLE_PROPERTY_NAME, "");
//                 carouselgridList.add(new CarouselgridItem(title));
//             }
//         }
//     }

//     public List<CarouselgridItem> getCarouselgridList() {
//         return carouselgridList != null ? new ArrayList<>(carouselgridList) : null;
//     }

// }
