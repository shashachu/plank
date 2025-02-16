//
// Pin.h
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

#import <Foundation/Foundation.h>
#import "PlankModelRuntime.h"
@class Board;
@class Image;
@class PinBuilder;
@class User;

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM(unsigned char, PinAttributionObjectsInternalType) {
    PinAttributionObjectsInternalTypeBoard = 1,
    PinAttributionObjectsInternalTypeUser = 2
};

@interface PinAttributionObjects : NSObject<NSCopying, NSSecureCoding>


+ (instancetype)objectWithBoard:(Board *)board;
+ (instancetype)objectWithUser:(User *)user;
- (void)matchBoard:(nullable PLANK_NOESCAPE void (^)(Board * board))boardMatchHandler orUser:(nullable PLANK_NOESCAPE void (^)(User * user))userMatchHandler;
- (BOOL)isEqualToPinAttributionObjects:(PinAttributionObjects *)anObject;
- (id)dictionaryObjectRepresentation;
@end

NS_ASSUME_NONNULL_END

typedef NS_ENUM(char, PinInStock) {
    PinInStockUnknown = -1,
    PinInStockOutOfStock = 0,
    PinInStockInStock = 1
};

NS_ASSUME_NONNULL_BEGIN

@interface Pin : NSObject<NSCopying, NSSecureCoding>
@property (nullable, nonatomic, strong, readonly) NSDictionary<NSString *, NSString *> * attribution;
@property (nullable, nonatomic, strong, readonly) NSArray<PinAttributionObjects *> * attributionObjects;
@property (nullable, nonatomic, strong, readonly) Board * board;
@property (nullable, nonatomic, copy, readonly) NSString * color;
@property (nullable, nonatomic, strong, readonly) NSDictionary<NSString *, NSNumber /* Integer */ *> * counts;
@property (nonnull, nonatomic, copy, readonly) NSDate * createdAt;
@property (nonnull, nonatomic, strong, readonly) NSDictionary<NSString *, User *> * creator;
@property (nullable, nonatomic, copy, readonly) NSString * descriptionText;
@property (nonnull, nonatomic, copy, readonly) NSString * identifier;
@property (nullable, nonatomic, strong, readonly) Image * image;
@property (nonatomic, assign, readonly) PinInStock inStock;
@property (nullable, nonatomic, copy, readonly) NSURL * link;
@property (nullable, nonatomic, strong, readonly) NSDictionary<NSString *, NSString *> * media;
@property (nullable, nonatomic, copy, readonly) NSString * note;
@property (nullable, nonatomic, strong, readonly) NSArray<NSDictionary *> * tags;
@property (nullable, nonatomic, copy, readonly) NSURL * url;
@property (nullable, nonatomic, strong, readonly) NSDictionary * visualSearchAttrs;

+ (NSString *)className;
+ (NSString *)polymorphicTypeIdentifier;
+ (instancetype)modelObjectWithDictionary:(NSDictionary *)dictionary;
- (instancetype)initWithModelDictionary:(NS_VALID_UNTIL_END_OF_SCOPE NSDictionary *)modelDictionary;
- (instancetype)initWithBuilder:(PinBuilder *)builder;
- (instancetype)initWithBuilder:(PinBuilder *)builder initType:(PlankModelInitType)initType;
- (instancetype)copyWithBlock:(PLANK_NOESCAPE void (^)(PinBuilder *builder))block;
- (BOOL)isEqualToPin:(Pin *)anObject;
- (instancetype)mergeWithModel:(Pin *)modelObject;
- (instancetype)mergeWithModel:(Pin *)modelObject initType:(PlankModelInitType)initType;
- (NSDictionary *)dictionaryObjectRepresentation;
- (BOOL)isAttributionSet;
- (BOOL)isAttributionObjectsSet;
- (BOOL)isBoardSet;
- (BOOL)isColorSet;
- (BOOL)isCountsSet;
- (BOOL)isCreatedAtSet;
- (BOOL)isCreatorSet;
- (BOOL)isDescriptionTextSet;
- (BOOL)isIdentifierSet;
- (BOOL)isImageSet;
- (BOOL)isInStockSet;
- (BOOL)isLinkSet;
- (BOOL)isMediaSet;
- (BOOL)isNoteSet;
- (BOOL)isTagsSet;
- (BOOL)isUrlSet;
- (BOOL)isVisualSearchAttrsSet;
@end

@interface PinBuilder : NSObject
@property (nullable, nonatomic, strong, readwrite) NSDictionary<NSString *, NSString *> * attribution;
@property (nullable, nonatomic, strong, readwrite) NSArray<PinAttributionObjects *> * attributionObjects;
@property (nullable, nonatomic, strong, readwrite) Board * board;
@property (nullable, nonatomic, copy, readwrite) NSString * color;
@property (nullable, nonatomic, strong, readwrite) NSDictionary<NSString *, NSNumber /* Integer */ *> * counts;
@property (nonnull, nonatomic, copy, readwrite) NSDate * createdAt;
@property (nonnull, nonatomic, strong, readwrite) NSDictionary<NSString *, User *> * creator;
@property (nullable, nonatomic, copy, readwrite) NSString * descriptionText;
@property (nonnull, nonatomic, copy, readwrite) NSString * identifier;
@property (nullable, nonatomic, strong, readwrite) Image * image;
@property (nonatomic, assign, readwrite) PinInStock inStock;
@property (nullable, nonatomic, copy, readwrite) NSURL * link;
@property (nullable, nonatomic, strong, readwrite) NSDictionary<NSString *, NSString *> * media;
@property (nullable, nonatomic, copy, readwrite) NSString * note;
@property (nullable, nonatomic, strong, readwrite) NSArray<NSDictionary *> * tags;
@property (nullable, nonatomic, copy, readwrite) NSURL * url;
@property (nullable, nonatomic, strong, readwrite) NSDictionary * visualSearchAttrs;

- (instancetype)initWithModel:(Pin *)modelObject;
- (Pin *)build;
- (void)mergeWithModel:(Pin *)modelObject;
@end

NS_ASSUME_NONNULL_END
